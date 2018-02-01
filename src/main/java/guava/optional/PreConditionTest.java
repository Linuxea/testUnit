package guava.optional;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class PreConditionTest {
	
	@Test
	public void test() {
		String str = null;
		Preconditions.checkNotNull(str, "str can't not be null");
	}
	
	@Test
	public void testState() {
		Boolean ok = Boolean.FALSE;
		Preconditions.checkState(ok == false, "ok should be false");
	}
	
	@Test
	public void equalsTest() {
		boolean isEq = Objects.equal(null, null);
		System.out.println(isEq);
	}
	
	@Test
	public void hashTest() {
		Animal pig = new Animal(3, "pink pig");
		Animal panda = new Animal(18, "panda cat");
		
		int pighash = Objects.hashCode(pig);
		int pandaHash = Objects.hashCode(panda);
		
		System.out.println(pighash);
		System.out.println(pandaHash);
		
		System.out.println(Objects.hashCode(pig, panda));
	}
	
	
	@Test
	public void compareTest() {
		Animal pig = new Animal(3, "pink pig");
		Animal panda = new Animal(18, "panda cat");
		int result = pig.compartTo(panda);
		System.out.println(result);
	}
	
}
