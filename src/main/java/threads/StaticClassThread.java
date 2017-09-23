package threads;

import java.util.concurrent.TimeUnit;

/**
 * 静态方法锁的测试
 * Created by Linuxea on 2017-09-23.
 */
public class StaticClassThread {

    public synchronized static void sayHello() throws InterruptedException {
        System.out.println("say hello");
        TimeUnit.SECONDS.sleep(5);
    }

    public synchronized static void sayHi() throws InterruptedException {
        System.out.println("say hi");
        TimeUnit.SECONDS.sleep(5);
    }

    public static void main(String[] args) throws Exception{
        new Thread(() ->{
            try {
                StaticClassThread.sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() ->{
            try {
                StaticClassThread.sayHi();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
