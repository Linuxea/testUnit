package guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class CacheTest {

	@Test
	public void test1() throws InterruptedException, ExecutionException {
		Cache cache =
				CacheBuilder.newBuilder()
						.maximumSize(100)
						.expireAfterWrite(5, TimeUnit.SECONDS)
						.build();
		cache.put("name", "linuxea");
		cache.put("sex","boy");
		cache.put("age", 11);
		while (true){
			TimeUnit.SECONDS.sleep(1);
			Object obj = cache.get("name", () -> "ok");
			System.out.println(obj);
		}
	}

}
