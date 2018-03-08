package lambda.supplier_lazy;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author linuxea
 * @date 2018/3/9
 */
public class LazySupplierA<T> {
	
	private Supplier<T> fooField = () -> {
		T val = expensiveInit();
		// init once
		fooField = () -> val;
		return val;
	};
	
	public static void main(String[] args) {
		LazySupplierA<String> stringLazySupplierA = new LazySupplierA<>();
		System.out.println(stringLazySupplierA.getFoo());
		System.out.println(stringLazySupplierA.getFoo());
		System.out.println(stringLazySupplierA.getFoo());
	}
	
	private T expensiveInit() {
		System.out.println("expensiveInit");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public T getFoo() {
		return fooField.get();
	}
}
