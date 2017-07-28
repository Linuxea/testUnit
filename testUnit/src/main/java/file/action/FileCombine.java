package file.action;

import org.testng.collections.Lists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

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
            is.close();
        }

        File file = new File(baseFilePath + "\\" + UUID.randomUUID() +  ".jpg");
        FileOutputStream out = null;
        for(byte[] bytes : byteList){
            out = new FileOutputStream(file);
            out.write(bytes);
            System.out.println("wrinting...");
        }
        out.flush();
        out.close();



    }

    public static void main(String[] argc){
        try {
            FileCombine.combine("eaa0f714-aebc-495b-8916-d9145dde00fa_the");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
