package file.action;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 * Created by Linuxea on 2017-07-28.
 */
public class FileSplit {

    private static final int size = 204800; //切割文件大小
    private int partNum; //切割块数  //TODO 根据块数去决定
    private static String baseFilePath = "C:\\Users\\linuxea.lin\\Desktop\\split";

    FileSplit(int partNum, String baseFilePath){
        this.partNum = partNum;
        this.baseFilePath = baseFilePath;
    }

    FileSplit(int partNum){
        this.partNum = partNum;
    }

    public static void make(String fileName) throws Exception {

        Map<String,byte[]> byteMap = new HashMap<>();
        int count = 0; //切割的第N块
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("file not exists");
            return;
        }

        FileInputStream is = new FileInputStream(file);

        DataInputStream ds = new DataInputStream(is);
       // int temp = 0;
        String randomName = UUID.randomUUID().toString();
    /*    while(-1 != temp){
            byte[] b = new byte[size]; //每次都是新的 杜绝有最后一次数据覆盖不全及其它情况
            temp =  is.read(b);
            System.out.println("???" + Arrays.toString(b));
            byteMap.put(randomName + "_the_" + (count++),b);
            System.out.println("reading...");
        }*/
    for(;;){
        byte[] b = new byte[size]; //每次都是新的 杜绝有最后一次数据覆盖不全及其它情况
        if(-1 != (ds.read(b))){
            byteMap.put(randomName + "_the_" + (count++),b);
        }else{
            break;
        }
    }

        //将存放在硬盘
        Set<String> keys =  byteMap.keySet();
        for(String keyStr : keys){
            File f = new File(baseFilePath + "\\" + keyStr);
            FileOutputStream outputStream = new FileOutputStream(f);
            outputStream.write(byteMap.get(keyStr));
            System.out.println("writing ....");
            outputStream.flush();
            outputStream.close();
        }
    }

    public static void main(String[] argc) {
        try {
            FileSplit.make("C:\\Users\\linuxea.lin\\Desktop\\数据词典20170427.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
