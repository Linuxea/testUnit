package interview.xiaju.staticwithstaticblock;

/**
 * Created by Linuxea on 17-11-21.
 */

public class Son extends Father {

    static {
        System.out.println("I am a son static");
    }

    {
        System.out.println("I am a son static block");
    }

    public Son() {
        System.out.println(" I am a son no parameter construct");
    }

    public static void main(String[] args) {
        System.out.println("begin");
        new Son();
        new Son();
        System.out.println("end");
    }

}
