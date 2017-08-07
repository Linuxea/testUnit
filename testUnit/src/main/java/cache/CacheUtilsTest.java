package cache;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Linuxea on 2017/8/7.
 */
public class CacheUtilsTest {

	@Test
	public void test() throws InterruptedException {
		CacheUtils.setWithSeconds("name","linuxea",5);
		for (;;){
			String data = CacheUtils.get("name");
			System.out.println(data);
			TimeUnit.SECONDS.sleep(2);
		}
	}

	@Test
	public void test2() throws InterruptedException{
		CacheUtils.setWithSeconds("name", "linuxea", 5);
		for (int i = 0; i < 15; i++) {
			String object = CacheUtils.get("name");
			System.out.println(object);
			TimeUnit.SECONDS.sleep(1);
		}
	}

}
