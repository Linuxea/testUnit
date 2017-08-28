package lambda;

import org.junit.Test;

public class ThreadTest {

    @Test
    public void test1() {
        new Thread(() -> System.out.println("hello")).start();
    }

    @Test
    public void test2() {
        Runnable runnable = () -> System.out.println("run..");
        new Thread(runnable).start();
    }
}
