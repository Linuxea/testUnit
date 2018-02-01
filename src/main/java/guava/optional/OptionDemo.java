package guava.optional;

import com.google.common.base.Optional;
import org.junit.Test;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class OptionDemo {
	
	@Test
	public void test1() {
		Object optional = Optional.fromNullable(null).or("fuck");
		System.out.println(optional);
	}
	
	@Test
	public void test2() {
		String empty = String.valueOf("");
		String empty2 = String.valueOf("");
		System.out.println(empty == empty2);
		System.out.println("" == "");
		System.out.println(returnEmpty() == returnEmpty2());
	}
	
	private String returnEmpty() {
		return "";
	}
	
	private String returnEmpty2() {
		return "";
	}
	
	
}
