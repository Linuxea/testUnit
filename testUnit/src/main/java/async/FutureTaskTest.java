package async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 *@date      2017年7月10日 上午10:01:07
 *@desc      class description
 *@version   1.0
 *@author    Linuxea.lin
*/
public class FutureTaskTest {
	
	@Test
	public void test1() {
		ExecutorService exec = Executors.newFixedThreadPool(1);
		FutureTask<Integer> ft = new FutureTask<>(() -> {
			System.out.println("老子要休眠2s，请注意.....");
			TimeUnit.SECONDS.sleep(2);
			return Integer.valueOf(10086);
		});
		exec.submit(ft);
		System.out.println("你好啊@");
		try {
			System.out.println("isDone:" + ft.isDone());
			Object rs = ft.get();
			System.out.println(rs);
			System.out.println("isDone:" + ft.isDone());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			exec.shutdown();
		}
	}
	
}
