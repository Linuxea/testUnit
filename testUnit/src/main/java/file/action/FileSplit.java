package file.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 * Created by Linuxea on 2017-07-28.
 */
public class FileSplit {

    private static final int size =20000; //切割文件大小
    private int partNum; //切割块数  //TODO 根据块数去决定
    private static String baseFilePath = "C:\\Users\\Administrator.SKY-20170312TVX\\Desktop\\split";

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
        int temp = 0;
        String randomName = UUID.randomUUID().toString();
        while(-1 != temp){
            byte[] b = new byte[size];
            temp =  is.read(b);
            byteMap.put(randomName + "_the_" + (count++),b);
            System.out.println("reading...");
        }

        //将数组存放在硬盘
        Set<String> keys =  byteMap.keySet();
        for(String keyStr : keys){
            File f = new File(baseFilePath + "\\" + keyStr);
            if(!f.exists())f.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(f);
            outputStream.write(byteMap.get(keyStr));
            System.out.println("writing ....");
        }
    }

    public static void main(String[] argc) {
        try {
            FileSplit.make("C:\\Users\\Administrator.SKY-20170312TVX\\Desktop\\1.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
