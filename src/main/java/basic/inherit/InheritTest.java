package basic.inherit;

import org.junit.Test;

/**
 * @author Linuxea.lin
 * @version 1.0
 * @date 2017年7月11日 上午10:25:52
 * @desc class description
 */
public class InheritTest {

	@Test
	public void test1() {
		Son son = new Son();
		son.say();
		son.fatherSay();
	}

}
