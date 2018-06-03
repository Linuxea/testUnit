package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 主线程与子线程们的执行结束
 *
 * @author linuxea
 * @date 2018/6/3
 */
public class OutofMail {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		OutofMail outofMail = new OutofMail();
		executorService.execute(outofMail::run);
		
		// 关闭线程池
		executorService.shutdown();
		// 检查线程池任务是否结束
		while (executorService.isTerminated() == false) ;
		
		System.out.println("main线程是我" + Thread.currentThread().getName());
	}
	
	private void run() {
		System.out.println("我要开始执行了" + Thread.currentThread().getName());
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("我要结束 执行了" + Thread.currentThread().getName());
	}
}
