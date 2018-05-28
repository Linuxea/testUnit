package datastructure;

import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class MyQueueTest {
	
	@Test
	public void test() {
		MyQueue<Integer> integerMyQueue = new MyQueue<>();
		integerMyQueue.in(1);
		integerMyQueue.in(2);
		integerMyQueue.in(3);
		integerMyQueue.in(4);
		System.out.println(integerMyQueue.size());
		System.out.println(integerMyQueue.isEmpty());
		while (true) {
			Integer pop = integerMyQueue.out();
			if (null == pop) {
				break;
			} else {
				System.out.println(pop);
			}
		}
	}
	
}