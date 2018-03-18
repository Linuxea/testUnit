package lambda;

import org.junit.Test;

import java.util.List;

/**
 * @author Linuxea.lin
 * @version 1.0
 * @date 2017年7月10日 下午4:31:41
 * @desc 方法引用
 */
public class MethodReferencesTest {

    @Test
    public void test1() {
        List<String> listStr = java.util.Arrays.asList("a", "b", "c");
        listStr.stream().map(String::toUpperCase).forEach(System.out::println);
//		LazySupplierA
//		SupplierLazyB
//		C

    }


}
