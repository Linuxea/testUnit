package threads.singleton;

/**
 * 枚举实现单例
 */
public class EnumSingleton {

    public static void main(String[] args) {
        System.out.println(Singleton.HEHE == Singleton.HEHE); // true
    }

    private enum Singleton {
        HEHE
    }

}
