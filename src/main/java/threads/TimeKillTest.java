package threads;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * negative example
 * timer will kill all threads when it doesn't catch exception
 *
 * @author linuxea
 * @date 17-11-29
 **/
public class TimeKillTest {

    private static int RUN_TIMES = 10;

    public static void main(String[] args) {

        for (int i = 0; i < RUN_TIMES; i++) {
            new Thread(() -> System.out.println("happy go")).start();
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer("killPlan");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("after 3s ...");
                // warn
                throw new RuntimeException("aaa");
            }
        }, 0, 3000);
    }

}
