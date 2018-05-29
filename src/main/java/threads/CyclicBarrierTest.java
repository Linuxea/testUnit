package threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class CyclicBarrierTest {
	
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(() -> {
				System.out.println("hello ," + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(1);
					cyclicBarrier.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			});
			thread.setName("thread:" + i);
			thread.start();
		}
		
		System.out.println("等待 ing ..");
		System.out.println("ok");
	}
	
}
