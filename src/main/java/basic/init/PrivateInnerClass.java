package basic.init;

/**
 * create by linuxea on 17-11-22
 **/
public class PrivateInnerClass {

//    private PrivateInnerClass privateInnerClass;

    static {
        System.out.println("privateInnerClass static");
    }

    private PrivateInnerClass() {
    }

    public static PrivateInnerClass getInstance() {
        return Temp.privateInnerClass;
    }

    public static void main(String[] args) {
        System.out.println(PrivateInnerClass.getInstance() == PrivateInnerClass.getInstance());
    }

    private static class Temp {
        private static PrivateInnerClass privateInnerClass = new PrivateInnerClass();

        static {
            System.out.println("temp static");
        }
    }


}
