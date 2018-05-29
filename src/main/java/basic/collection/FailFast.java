package basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class FailFast {
	
	public void fail() {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		System.out.println(integers);
		for (Integer integer : integers) {
			boolean add = integers.add(1);
			System.out.println(add);
			boolean remove = integers.remove(integer);
			System.out.println(remove);
		}
		System.out.println(integers);
		
	}
	
	public void notFail() {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		System.out.println(integers);
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			iterator.remove();
		}
		System.out.println(integers);
	}
	
}
