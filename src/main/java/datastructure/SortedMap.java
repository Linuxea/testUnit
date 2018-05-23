package datastructure;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class SortedMap {
	
	public void treeMap() {
		TreeMap<Integer, Integer> stringStringTreeMap = new TreeMap<>(Comparator.comparingInt(o -> o));
		for (int i = 0; i < 1000000; i++) {
			stringStringTreeMap.put(i, i);
		}
	}
	
	public void linkedHashMap() {
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
		for (int i = 0; i < 19; i++) {
			linkedHashMap.put(i, i);
		}
		
		Iterator<Integer> iterator = linkedHashMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
			System.out.println(linkedHashMap.get(next));
			System.out.println("===============");
		}
	}
	
}
