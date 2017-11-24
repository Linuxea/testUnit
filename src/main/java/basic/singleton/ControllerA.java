package basic.singleton;

/**
 * controller combine service for singleton
 * Created by Linuxea on 17-11-25.
 */

public class ControllerA {

    private static final ServiceA SERVICE_A = new ServiceA();

    public static ServiceA getServiceA() {
        return SERVICE_A;
    }
}
