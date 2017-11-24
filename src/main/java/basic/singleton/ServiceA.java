package basic.singleton;

/**
 * Created by Linuxea on 17-11-25.
 */

public class ServiceA {

    private ServiceA() throws Exception {
        throw new Exception("can not be init");
    }

    public void say() {
        System.out.println("I am service a");
    }

}
