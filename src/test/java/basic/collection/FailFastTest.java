package basic.collection;

import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class FailFastTest {
	
	@Test
	public void failTest() {
		FailFast failFast = new FailFast();
		failFast.fail();
	}
	
	@Test
	public void successTest() {
		FailFast failFast = new FailFast();
		failFast.notFail();
	}
	
}