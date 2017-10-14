package interview.baturu;

import java.util.concurrent.TimeUnit;

/**
 * 成员变量非静态变量的多线程问题 类似于 SimpleDateFormat
 * Created by Linuxea on 10/14/17.
 * never forget a shame like this
 */
public class ClassLocalTest {

    private String string = "local";

    public static void main(String[] args) {

        ClassLocalTest classLocalTest = new ClassLocalTest();

        for (int i = 0; i < 100; i++) {
            int temp = i;
            new Thread(() -> {
                classLocalTest.change(temp);
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                classLocalTest.print();
            }).start();

        }
    }

    public void change(int i) {
        string = "me" + i;
    }

    public void print() {
        System.out.println(string);
    }

}
