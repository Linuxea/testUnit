package ref;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class WeakTest {
	
	private Weak weak;
	
	@Before
	public void before() {
		weak = new Weak();
	}
	
	@After
	public void after() {
		weak = null;
	}
	
	@Test
	public void weakTest() {
		weak.weak();
	}
	
	@Test
	public void softTest() {
		weak.soft();
	}
	
}