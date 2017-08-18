package guava.collection;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.Map;
import java.util.TreeSet;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class CollectionTest {

	@Test
	public void test1(){
		ImmutableSet immutableSet = ImmutableSet.of(1,2,3,4,4,5,8,9,10);
		System.out.println(immutableSet.asList());
		System.out.println(immutableSet.toString());

		ImmutableSet copyImmutable = ImmutableSet.copyOf(immutableSet);
		System.out.println(copyImmutable);
	}

	@Test
	public void test2(){
		ImmutableMap map =
				ImmutableMap.of("name","linuxea","sex", "boy","age",2);
		System.out.println(map);
	}

	@Test
	public void test3(){
		ImmutableMultiset.of();
	}

	@Test
	public void test4(){
		Multiset multiset = HashMultiset.create();
		multiset.add(1);
		multiset.add(2);
		multiset.add(1);
		int oneCount = multiset.count(1);
		int twoCount = multiset.count(2);
		System.out.println(oneCount);
		System.out.println(twoCount);

		System.out.println(multiset.elementSet());
	}


	@Test
	public void test7(){
		Multimap multimap = HashMultimap.create();
		multimap.put("name", "linuxea");
		multimap.put("friends","a");
		multimap.put("friends","b");
		multimap.put("friends","c");
		multimap.put("friends","d");
		System.out.println(multimap);

		Map<String, String> map = multimap.asMap();
		System.out.println(map);
	}

	@Test
	public void rangeTest(){
		RangeSet<Integer> rangeSet = TreeRangeSet.create();
		rangeSet.add(Range.openClosed(0,100));
		rangeSet.add(Range.openClosed(100,120));
		System.out.println(rangeSet.span());
	}

	@Test
	public void test11(){
		ImmutableSet.of(1,2,3,4,5).parallelStream().forEach(System.out::print);
		System.out.println("\n**************");
		ImmutableSortedSet.of(1,2,3,4,5).parallelStream().forEach(System.out::print);
	}



}
