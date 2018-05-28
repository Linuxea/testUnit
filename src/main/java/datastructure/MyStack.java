package datastructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * linked 实现栈
 *
 * @author linuxea
 * @date 2018/5/29
 */
public class MyStack<T> {
	
	private LinkedList<T> linkedList = new LinkedList<>();
	
	public void push(T t) {
		linkedList.addFirst(t);
	}
	
	public T pop() {
		try {
			return linkedList.removeFirst();
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
}
