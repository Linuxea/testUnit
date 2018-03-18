package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author linuxea
 * @date 2018/3/18
 */
public class ThreadContext {
	
	/**
	 * about thread
	 */
	public void printContext() {
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		URL resource = contextClassLoader.getResource("");
		String path = resource.getPath();
		System.out.println("path:" + path);
	}
	
	/**
	 * classpath: class root menu
	 *
	 * @throws IOException
	 */
	public void printContextPro() throws IOException {
		InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("thread.property");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
		String line;
		while (null != (line = bufferedReader.readLine())) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
	
}
