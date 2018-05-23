package datastructure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class SortedMapTest {
	
	private SortedMap sortedMap;
	
	@Before
	public void before() {
		sortedMap = new SortedMap();
		System.out.println("start");
	}
	
	@After
	public void after() {
		sortedMap = null;
		System.out.println("after");
	}
	
	@Test
	public void treeMapTest() {
		sortedMap.treeMap();
	}
	
	@Test
	public void linkedHashMapTest() {
		sortedMap.linkedHashMap();
	}
	
}