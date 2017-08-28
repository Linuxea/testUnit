package utils;

import com.google.common.collect.Maps;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Linuxea on 2017/8/8.
 */
public class ReceiptNOUtils {

    private static final Map<String, AtomicInteger> receiptAtomic = Maps.newConcurrentMap();
    private static final Map<String, String> receptiPrefix = Maps.newConcurrentMap(); //table与前缀的映射
    private static final Map<String, String> timeMap = Maps.newConcurrentMap(); //模块与时间格式关联
    private static final Object lock = new Object();
    private static int NUM_LEN = 3;

    /**
     * 获取生成的单据号码
     * 每个生成的单据号码是唯一 请确保获取后不要浪费掉
     * constStant 为 String 类的对应常量
     * tableName 为表名
     * receiptFieldName 为单据号的字段名 一般为RECEPTI_ID
     * idFieldName 为表的ID字段名
     *
     * @param constStant
     * @param tableName
     * @param receiptFieldName
     * @param idFieldName
     * @return
     */
    public static String getReceipt(String constStant, String tableName, String receiptFieldName, String idFieldName) {
        String prefix = getPrefix(constStant, tableName);
        String time = getTime(constStant, tableName);
        Integer tailNums = getTailNums(constStant, tableName, receiptFieldName, idFieldName);
        String afterHandle = handleTailNums(tailNums);
        return new StringBuilder().append(prefix).append(time).append(afterHandle).toString();
    }

    /**
     * 尾数处理
     *
     * @param tailNums
     */
    private static String handleTailNums(Integer tailNums) {
        StringBuilder sb = new StringBuilder("");
        for (int j = tailNums.toString().length(); NUM_LEN > j; j++) {
            sb.append("0"); //不足三位前面补零 超过三位返回原来值
        }
        return sb.append(tailNums).toString();
    }


    /**
     * 获取递增尾数
     *
     * @param constStant
     * @param tableName
     * @param receiptFieldName
     * @param idFieldName
     * @return
     */
    private static Integer getTailNums(String constStant, String tableName, String receiptFieldName, String idFieldName) {
        if (null != receiptAtomic.get(tableName)) {
            return receiptAtomic.get(tableName).incrementAndGet();
        }
        synchronized (lock) {
            if (null == receiptAtomic.get(tableName)) {
                String sql = "SELECT " + receiptFieldName + " FROM " + tableName + " WHERE " + idFieldName + " = (SELECT MAX(" + idFieldName + ") FROM " + tableName + ") AND DATE(CREATE_TIME) = '" + LocalDate.now() + "' ;";
                Record latestRecord = Db.findFirst(sql);
                if (null == latestRecord) { //表示是今天第一个获取
                    receiptAtomic.put(tableName, new AtomicInteger(0));
                } else {
                    String receiptVal = latestRecord.getStr(receiptFieldName);
                    String prefix = getPrefix(constStant, tableName);
                    String time = getTime(constStant, tableName);
                    receiptVal = receiptVal.substring(prefix.length() + time.length()); //防止尾数不止三位的特殊情况
                    receiptAtomic.put(tableName, new AtomicInteger(Integer.parseInt(receiptVal)));
                }
            }
        }

        return receiptAtomic.get(tableName).incrementAndGet();
    }

    /**
     * 获取今天日期的形式
     *
     * @return
     */
    private static String getTime(String constStant, String tableName) {
        if (null == timeMap.get(tableName)) {
            synchronized (lock) {
                if (null == timeMap.get(tableName)) {
                    String sql = "SELECT PARAM_DISCRIPTION FROM SS_DOCUMNET_NUMBER_PARAM WHERE SS_DOCUMNET_NUMBER_PARAM.`PARAM_NAME` = ?;";
                    String tableTime = Db.queryStr(sql, constStant);
                    timeMap.put(tableName, tableTime);
                }
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(timeMap.get(tableName));
        return dateTimeFormatter.format(LocalDate.now());
    }


    /**
     * 获取对应模块的前缀
     *
     * @param constStant
     * @param tableName
     * @return
     */
    private static String getPrefix(String constStant, String tableName) {
        if (null == receptiPrefix.get(tableName)) {
            synchronized (lock) {
                if (null == receptiPrefix.get(tableName)) {
                    String sql = "SELECT PARAM_VALUE FROM SS_DOCUMNET_NUMBER_PARAM WHERE SS_DOCUMNET_NUMBER_PARAM.`PARAM_NAME` = ?;";
                    String tablePrefix = Db.queryStr(sql, constStant);
                    receptiPrefix.put(tableName, tablePrefix);
                }
            }
        }
        return receptiPrefix.get(tableName);
    }

}
