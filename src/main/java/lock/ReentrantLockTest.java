package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
	
	private ReentrantLock reentrantLock = new ReentrantLock();
	
	public static void main(String[] args) {
		ReentrantLockTest readWriteLockTest = new ReentrantLockTest();
		new Thread(() -> {
			try {
				readWriteLockTest.test();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "test-1").start();
		
		new Thread(() -> {
			try {
				readWriteLockTest.test2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "test-2").start();
	}
	
	public void test() throws InterruptedException {
		ReentrantLock reentrantLock = this.reentrantLock;
		Condition condition = reentrantLock.newCondition();
		reentrantLock.lock();
		System.out.println(Thread.currentThread().getName() + " lock");
		try {
			// await 将释释放锁  如果没有时间限制将一直
			condition.await(5, TimeUnit.SECONDS);
		} finally {
			reentrantLock.unlock();
		}
	}
	
	public void test2() throws InterruptedException {
		ReentrantLock reentrantLock = this.reentrantLock;
		Condition condition = reentrantLock.newCondition();
		reentrantLock.lock();
		System.out.println(Thread.currentThread().getName() + " lock");
		try {
			condition.await(5, TimeUnit.SECONDS);
		} finally {
			reentrantLock.unlock();
		}
	}
	
}
