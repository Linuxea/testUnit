package basic.collection;

import java.util.Vector;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class VectorTest {
	
	public void fail() {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		for (Integer integer : vector) {
			boolean add = vector.add(1);
			System.out.println(add);
		}
	}
	
}
