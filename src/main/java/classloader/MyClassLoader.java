package classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 自定义类加载器有问题版本
 * 问题不知道出在哪里呢
 */
@Deprecated
public class MyClassLoader extends ClassLoader {

    private String root;

    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader();
        myClassLoader.test();
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = load(name);
        System.err.println(Arrays.toString(classData));
        if (null != classData) {
            return defineClass(name, classData, 0, classData.length);
        }
        return null;
    }

    /**
     * 加载类返回二进制数组数据
     *
     * @param className
     * @return
     */
    public byte[] load(String className) {

        String fileName = getRoot() + File.separatorChar
                + className.replace('.', File.separatorChar) + ".class";

        fileName = fileName.replace("MyClassLoader/class", "MyClassLoader.class");
        System.out.println(fileName);
        try {
            InputStream ins = new FileInputStream(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            int length;
            while ((length = ins.read(buffer)) != -1) {
                baos.write(buffer, 0, length);
            }
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void test() {
        try {
            setRoot("/home/linuxea/git_home/testUnit/src/main/java");
            Class myClass = findClass("classloader.MyClassLoader");
            System.out.println(myClass.newInstance().getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("over");
        }
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
