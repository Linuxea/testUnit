package file.action;

import org.testng.collections.Lists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Linuxea on 2017-07-28.
 */
public class FileCombine {

    private static String baseFilePath = "C:\\Users\\Administrator.SKY-20170312TVX\\Desktop\\split";

    public static void combine(String fileName) throws Exception {
        File f = new File(baseFilePath);
        File[] childs = f.listFiles(file -> {return file.getName().startsWith(fileName);});

        List<File> fileList = Lists.newArrayList(childs);
        fileList.sort(Comparator.comparing(File::getName));

        List<byte[]> byteList = Lists.newArrayList(); //集成所有字节

        for(File temp : fileList){
            byte[] b = new byte[1024];
            FileInputStream is = new FileInputStream(temp);
            int byteCount = 0;
            while(byteCount != -1){
                byteCount =  is.read(b);
                byteList.add(b);
            }
        }

        File file = new File(baseFilePath + "\\" + "fuck.jpg");
        for(byte[] bytes : byteList){
            FileOutputStream out = new FileOutputStream(file);
            out.write(bytes);
            System.out.println("wrinting...");
        }


    }

    public static void main(String[] argc){
        try {
            FileCombine.combine("d299399b-88f9-4d60-b813-c712ab7fb208_the");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
