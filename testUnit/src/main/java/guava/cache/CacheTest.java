package guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class CacheTest {

	@Test
	public void test1(){
		Cache cache =
				CacheBuilder.newBuilder()
						.maximumSize(100)
						.expireAfterAccess(100, TimeUnit.SECONDS)
						.build();
		cache.put("name", "linuxea");
		cache.put("sex","boy");
		cache.put("age", 11);
		System.out.println(cache.asMap());
	}

}
