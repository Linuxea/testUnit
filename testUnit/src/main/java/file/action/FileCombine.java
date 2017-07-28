package file.action;

import org.testng.collections.Lists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/**
 * Created by Linuxea on 2017-07-28.
 */
public class FileCombine {

    private static String baseFilePath = "C:\\Users\\linuxea.lin\\Desktop\\split";

    public static void combine(String fileName) throws Exception {
        File f = new File(baseFilePath);
        File[] childs = f.listFiles(fli -> fli.getName().startsWith(fileName));

        List<File> fileList = Lists.newArrayList(childs);
        fileList.sort(Comparator.comparing(File::getName));

        List<byte[]> byteList = Lists.newArrayList(); //集成所有字节

        for(File temp : fileList){
            System.out.println("current file name:" + temp.getName());
            FileInputStream is = new FileInputStream(temp);
            int byteCount = 0;
            while(byteCount != -1){
                byte[] b = new byte[2048];
                byteCount =  is.read(b);
                byteList.add(b);
            }
            is.close();
        }

        File file = new File(baseFilePath + "\\" + UUID.randomUUID() +  ".pdf");

        System.err.println("all byte size:" + byteList.size());

        FileOutputStream out  = new FileOutputStream(file, true);
        for(byte[] bytes : byteList){
            out.write(bytes);
            System.out.println("wrinting...");
        }
        out.flush();
        out.close();




    }

    public static void main(String[] argc){
        try {
            FileCombine.combine("f44513fd-dfd4-40ae-8248-a6ccc5c2c785_the");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
