package datastructure;

import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class MyStackTest {
	
	@Test
	public void test() {
		MyStack<Integer> integerMyStack = new MyStack<>();
		System.out.println(integerMyStack.isEmpty());
		integerMyStack.push(1);
		integerMyStack.push(2);
		integerMyStack.push(3);
		integerMyStack.push(4);
		System.out.println("size: " + integerMyStack.size());
		System.out.println(integerMyStack.isEmpty());
		while (true) {
			Integer pop = integerMyStack.pop();
			if (null == pop) {
				break;
			} else {
				System.out.println(pop);
			}
		}
		System.out.println(integerMyStack.isEmpty());
	}
	
}