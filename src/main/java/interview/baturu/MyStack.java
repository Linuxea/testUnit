package interview.baturu;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * 实现一个栈，带有出栈（pop），入栈（push），取最小元素（getMin）三个方法。要保证这三个方法的时间复杂度都是O（1）
 * 注：入栈元素不重复
 * from https://zhuanlan.zhihu.com/p/31958400
 *
 * @author linuxea
 * @date 2018/6/5
 */
public class MyStack {
	
	/**
	 * 当栈来使用
	 */
	private LinkedList<Integer> linkedList = new LinkedList<>();
	
	/**
	 * 辅助栈
	 * 用来存放当前最小值
	 */
	private LinkedList<Integer> minCache = new LinkedList<>();
	
	/**
	 * 入栈
	 *
	 * @param element
	 */
	public void push(Integer element) {
		linkedList.addLast(element);
		minPush(element);
	}
	
	/**
	 * 出栈
	 *
	 * @return
	 */
	public Integer pop() {
		Integer pop;
		try {
			pop = linkedList.removeLast();
		} catch (NoSuchElementException e) {
			return null;
		}
		minPop(pop);
		return pop;
	}
	
	/**
	 * 取栈中最小值
	 *
	 * @return
	 */
	public Integer getMin() {
		try {
			return minCache.getLast();
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 最小值缓存栈入栈
	 *
	 * @param newElement
	 */
	private void minPush(Integer newElement) {
		Integer last;
		try {
			last = minCache.getLast();
		} catch (NoSuchElementException elementExceptionn) {
			minCache.addLast(newElement);
			return;
		}
		
		// 与原来最小的进行比较
		if (Integer.compare(last, newElement) > 0) {
			minCache.addLast(newElement);
			System.out.println(minCache);
		}
		
	}
	
	/**
	 * 最小值缓存栈出栈
	 *
	 * @param stackPopVal
	 */
	private void minPop(Integer stackPopVal) {
		Integer last;
		try {
			last = minCache.getLast();
		} catch (NoSuchElementException e) {
			return;
		}
		if (Integer.compare(stackPopVal, last) == 0) {
			Integer last1 = minCache.removeLast();
			System.out.println(last1);
		}
	}
	
}
