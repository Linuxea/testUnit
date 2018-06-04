package interview.baturu;

import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class MyStackTest {
	
	private MyStack myStack = new MyStack();
	
	@Test
	public void pushTest() {
		myStack.push(0);
		System.out.println("min " + myStack.getMin());
		myStack.push(-5);
		System.out.println("min " + myStack.getMin());
		myStack.push(8);
		System.out.println("min " + myStack.getMin());
		System.out.println(myStack.pop());
		System.out.println("min " + myStack.getMin());
	}
	
	
}