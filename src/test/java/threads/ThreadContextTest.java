package threads;

import org.junit.Test;

import java.io.IOException;

/**
 * @author linuxea
 * @date 2018/3/18
 */
public class ThreadContextTest {
	
	@Test
	public void printContextTest() {
		ThreadContext threadContext = new ThreadContext();
		threadContext.printContext();
	}
	
	@Test
	public void printContextPro() {
		ThreadContext threadContext = new ThreadContext();
		try {
			threadContext.printContext();
			threadContext.printContextPro();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}