package lambda;

import java.util.List;

import org.junit.Test;

/**
 *@date      2017年7月10日 下午4:31:41
 *@desc      方法引用
 *@version   1.0
 *@author    Linuxea.lin
*/
public class MethodReferencesTest {
	
	@Test
	public void test1(){
		List<String> listStr = java.util.Arrays.asList("a","b","c");
		listStr.stream().map(String::toUpperCase).forEach(System.out::println);
//		A
//		B
//		C

	}
	

}
