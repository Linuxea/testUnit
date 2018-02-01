package findclass;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Linuxea on 2017-08-19.
 */
public class FindClass {

	@Test
	public void test1() {
		URL url =
				this.getClass().getClassLoader().getResource("algorithm/easy");
		System.out.println(url.getFile());
	}

	@Test
	public void test2() throws IOException {
		try (InputStream inputStream =
					 this.getClass().getClassLoader().getResourceAsStream("algorithm/eas/.Lottery");
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			String str;
			while (null != (str = bufferedReader.readLine())) {
				System.out.println(str);
			}
		}
	}

}
