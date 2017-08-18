package guava.string;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Test;
import org.testng.collections.Sets;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class StringTest {

	@Test
	public void test(){
		Set<String> stringSet = Sets.newHashSet();
		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");
		stringSet.add("d");
		stringSet.add("e");
		stringSet.add(null);
		String joinerResult = Joiner.on(",").skipNulls().join(stringSet);
		System.out.println(joinerResult);
	}

	@Test
	public void splitterTest(){
		String str = "a,b,c,d,e";
		Iterable<String> iterable = Splitter.on(",").limit(3).split(str);
		for(Iterator<String> iterator = iterable.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}

//		iterable.forEach(System.out::println);
	}

	@Test
	public void charMatcherTest(){
		String str = "11";
		String newStr = CharMatcher.digit().and(CharMatcher.javaLowerCase()).removeFrom(str);
		System.out.println(newStr);
	}

	@Test
	public void StringByteTest(){
		String str = "I love kimboo";
		byte[] bytes = str.getBytes(Charsets.UTF_8);
		System.out.println(Arrays.toString(bytes));
	}

}
