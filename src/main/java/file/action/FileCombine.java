package file.action;

import org.testng.collections.Lists;

import java.io.DataInputStream;
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

    private static String baseFilePath = "C:\\Users\\linuxea.lin\\Desktop\\split";

    public static void combine(String fileName) throws Exception {
        File f = new File(baseFilePath);
        File[] childs = f.listFiles(fli -> fli.getName().startsWith(fileName));

        List<File> fileList = Lists.newArrayList(childs);
        fileList.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                String o1_suffix
                        = o1.getName().substring(o1.getName().lastIndexOf("_") + 1);
                String o2_suffix
                        = o2.getName().substring(o2.getName().lastIndexOf("_") + 1);
                if (Integer.parseInt(o1_suffix) > Integer.parseInt(o2_suffix)) {
                    return 1;
                } else if (Integer.parseInt(o1_suffix) == Integer.parseInt(o2_suffix)) {
                    return 0;
                }
                return -1;
            }
        });


        List<byte[]> byteList = Lists.newArrayList(); //集成所有字节

        for (File temp : fileList) {
            System.out.println("current file name:" + temp.getName());
            FileInputStream is = new FileInputStream(temp);
            DataInputStream ds = new DataInputStream(is);
//            int byteCount = 0;
            /*while(byteCount != -1){
                byte[] b = new byte[size];
                byteCount =  is.read(b);
                byteList.add(b);
            }*/

            for (; ; ) {
                byte[] b = new byte[FileConstant.size]; //每次都是新的 杜绝有最后一次数据覆盖不全及其它情况
                if (-1 != (ds.read(b))) {
                    byteList.add(b);
                } else {
                    break;
                }
            }

            is.close();
        }

        File file = new File(baseFilePath + "\\" + UUID.randomUUID() + ".txt");

        System.err.println("all byte size:" + byteList.size());

        FileOutputStream out = new FileOutputStream(file, true);
        for (byte[] bytes : byteList) {
            out.write(bytes);
            System.out.println("wrinting...");
        }
        out.flush();
        out.close();


    }

    public static void main(String[] argc) {
        try {
            FileCombine.combine("e39bd053-c028-486f-bc85-f598985dca86_the");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
