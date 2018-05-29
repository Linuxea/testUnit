package basic.collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class HashMapTest {
	
	public void test() {
		HashMap<String, String> stringStringHashMap = new HashMap<>(2);
		stringStringHashMap.put("name", "linuxea");
		stringStringHashMap.put("sex", "boy");
		Iterator<String> iterator = stringStringHashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String put = stringStringHashMap.put("dfd", "dfdf");
			System.out.println(put);
		}
	}
	
}
