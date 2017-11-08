package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SignalTest {

    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition condition = reentrantLock.newCondition();

    public static void main(String[] args) {
        SignalTest signalTest = new SignalTest();
        new Thread(() -> {
            signalTest.get();
        }).start();
        new Thread(() -> {
            signalTest.put();
        }).start();
    }

    public void get() {
        ReentrantLock reentrantLock = this.reentrantLock;
        reentrantLock.lock();
        try {
            condition.await(); // 将会一直等待下去直到signal
            System.out.println("我可以继续执行下去");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void put() {
        ReentrantLock reentrantLock = this.reentrantLock;
        reentrantLock.lock();
        try {
            System.out.println("我已经获取得 get 释放的锁了");
            TimeUnit.SECONDS.sleep(5);
            condition.signal(); // 通知
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }


}
