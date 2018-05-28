package datastructure;


import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class MyQueue<T> {
	
	private LinkedList<T> linkedList = new LinkedList<>();
	
	public void in(T t) {
		linkedList.addLast(t);
	}
	
	public T out() {
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
