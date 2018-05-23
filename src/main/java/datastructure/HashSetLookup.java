package datastructure;

import java.util.HashSet;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class HashSetLookup {
	
	public void hashSet() {
		HashSet<String> strings = new HashSet<>();
		strings.add("1");
		strings.add("2");
		
		boolean contains = strings.contains("1");
		boolean remove = strings.remove("2");
	}
	
}
