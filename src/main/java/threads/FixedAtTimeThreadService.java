package threads;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * schedule plan timer
 */
public class FixedAtTimeThreadService {

	private static ScheduledExecutorService scheduledExecutorService;


	/**
	 * do after init
	 */
	public static void init() {
		scheduledExecutorService = Executors.newScheduledThreadPool(3);
		scheduledExecutorService.scheduleAtFixedRate(() -> {
			System.out.println("hello: " + Thread.currentThread().getName());
		}, 1, 3, TimeUnit.SECONDS);

	}


	/**
	 * close thread pool resources
	 */
	public static void close() {
		if (null != scheduledExecutorService && scheduledExecutorService.isShutdown() == false) {
			scheduledExecutorService.shutdown();
		}
	}

	public static void main(String[] args) {
		FixedAtTimeThreadService.init();
		FixedAtTimeThreadService.close();
	}


}
