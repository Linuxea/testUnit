package guava.reflect;

import org.junit.Test;
import org.testng.collections.Lists;

import java.util.List;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class ReflectTest {

	@Test
	public void test(){
		List<String> strings = Lists.newArrayList("a","b","c","d");
		List<Integer> integers = Lists.newArrayList(1,2,3,4,5);
		System.out.println(strings.getClass().isAssignableFrom(integers.getClass())); //true
	}

}
