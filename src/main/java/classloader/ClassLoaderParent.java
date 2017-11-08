package classloader;

/**
 * 类的加载机制测试
 */
public class ClassLoaderParent {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoaderParent.class.getClassLoader();
        while (null != classLoader) {
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }

        System.out.println(ClassLoaderParent.class.getName());
    }

}
