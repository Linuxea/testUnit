package ref;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author linuxea
 * @date 2018/5/23
 */
public class Weak {
	
	public void weak() {
		String string = "go!";
		WeakReference<String> weakReference = new WeakReference<>(string);
		System.gc();
		System.out.println(weakReference.get());
	}
	
	public void soft() {
		String string = "go!";
		SoftReference<String> softReference = new SoftReference<>(string);
		System.gc();
		System.out.println(softReference.get());
	}

//	error
//	public void phantom(){
//		String string = "go!";
//		PhantomReference<String> phantomReference = new PhantomReference<>(string);
//		System.gc();
//		System.out.println(phantomReference.get());
//	}
	
	
}
