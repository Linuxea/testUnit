package guava.io;

import com.google.common.base.Charsets;
import com.google.common.io.ByteStreams;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class IOTest {

	@Test
	public void test1() throws IOException {
		InputStream inputStream = new FileInputStream("C:\\Users\\linuxea.lin\\Desktop\\test.txt");
		byte[] bytes = ByteStreams.toByteArray(inputStream);
		System.out.println(Arrays.toString(bytes));
		System.out.println(new String(bytes,Charsets.UTF_8)); //为什么还会乱码呢？
	}

}
