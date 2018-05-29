package threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class CountDownLatchTest {
	
	public static void main(String[] args) {
		
		CountDownLatch countDownLatch = new CountDownLatch(10);
		
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(() -> {
				System.out.println("hello ," + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(5);
					countDownLatch.countDown();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			thread.setName("thread:" + i);
			thread.start();
		}
		
		try {
			// 持续等待 Ing
			countDownLatch.await();
			System.out.println("over");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
