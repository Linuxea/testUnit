package guava.string;

import com.google.common.base.Joiner;
import org.junit.Test;
import org.testng.collections.Sets;

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

}
