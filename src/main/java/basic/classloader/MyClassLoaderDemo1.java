package basic.classloader;


import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author linuxea
 * @date 2018/5/29
 */
public class MyClassLoaderDemo1 {
	
	public void run() {
		
		ClassLoader classLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					System.out.println(this.getClass().getClassLoader());
					System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
					InputStream resourceAsStream = this.getClass().getResourceAsStream(fileName);
					if (null == resourceAsStream) {
						// 找不到资源 让父亲加载器去加载
						return super.loadClass(name);
					}
					byte[] bytes = new byte[resourceAsStream.available()];
					resourceAsStream.read(bytes);
					return defineClass(name, bytes, 0, bytes.length);
				} catch (IOException e) {
					throw new ClassNotFoundException(name);
				}
			}
		};
		
		try {
			Object o = classLoader.loadClass("basic.classloader.MyClassLoaderDemo1").newInstance();
			System.out.println(o.getClass());
			System.out.println(o instanceof MyClassLoaderDemo1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		
	}
	
}
