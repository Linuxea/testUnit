package lambda.supplier_lazy;

import java.util.function.Supplier;

/**
 * @author linuxea
 * @date 2018/3/9
 */
public class SupplierLazyB<T> {
	private Supplier<T> fooField = () -> expensiveInit();
	
	public static void main(String[] args) {
		SupplierLazyB<String> stringSupplierLazyB = new SupplierLazyB<>();
		System.out.println(stringSupplierLazyB.getFoo());
		System.out.println(stringSupplierLazyB.getFoo());
		System.out.println(stringSupplierLazyB.getFoo());

//		expensive
//		null
//		expensive
//		null
//		expensive
//		null
	}
	
	private T expensiveInit() {
		System.out.println("expensive");
		return null;
	}
	
	public T getFoo() {
		return fooField.get();
	}
}
