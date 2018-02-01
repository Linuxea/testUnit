package guava.prim;

import org.junit.Test;
import org.testng.internal.collections.Ints;

import java.util.List;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class primitiveTest {
	
	@Test
	public void test() {
		List<Integer> list = Ints.asList(1, 2, 3, 4, 4);
		System.out.println(list);
		Ints.asList(1, 2, 3).stream().forEach(System.out::println);
	}
	
}
