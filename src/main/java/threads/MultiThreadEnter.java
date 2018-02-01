package threads;

import java.util.concurrent.TimeUnit;

/**
 * create by linuxea on 17-11-23
 **/
public class MultiThreadEnter {

	private int i = 0;

	public static void main(String[] args) {
		MultiThreadEnter multiThreadEnter = new MultiThreadEnter();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				try {
					multiThreadEnter.go();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}, "name:" + i).start();
		}
	}


	public void go() throws InterruptedException {
		if (i == 0) {
			TimeUnit.SECONDS.sleep(2);
			synchronized (this) {
				if (i == 0) { // it is necessary double check
					++i;
					System.out.println("no body can enter after me " + Thread.currentThread().getName());
				}
			}
		}
	}

}
