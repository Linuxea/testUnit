package guava.collection;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class CollectionTest {

	@Test
	public void test1(){
		ImmutableSet immutableSet = ImmutableSet.of(1,2,3,4,4,5,8,9,10);
		System.out.println(immutableSet.asList());
		System.out.println(immutableSet.toString());

		ImmutableSet copyImmutable = ImmutableSet.copyOf(immutableSet);
		System.out.println(copyImmutable);
	}

}
