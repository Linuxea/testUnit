package basic.runtime;

import java.util.concurrent.TimeUnit;

/**
 * create by linuxea on 17-11-23
 **/
public class SystemWithOut {

    public static void main(String[] args) throws InterruptedException {

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("I am out");
        }));

        TimeUnit.SECONDS.sleep(5);

        System.exit(0);

    }

}

