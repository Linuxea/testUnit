package lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * 读写销赃的测试
 */
public class ReadWriteLockTest {

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();

    public static void main(String[] args) {

        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int j = i;
            executorService.execute(() -> {
                try {
                    if (j % 2 == 0) {
                        readWriteLockTest.read();
                    } else {
                        readWriteLockTest.write();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }


        executorService.shutdown();

    }

    public void read() throws InterruptedException {
        readLock.lock();
        try {
            System.out.println("我是读的");
        } finally {
            readLock.unlock();
        }

    }

    public void write() throws InterruptedException {
        writeLock.lock();
        try {
            System.out.println("I am a write lock, that blothers write locks and read locks");
            TimeUnit.SECONDS.sleep(5);
        } finally {
            writeLock.unlock();
        }

    }

}
