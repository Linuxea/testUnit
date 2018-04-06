package basic.file.random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author linuxea
 * @date 2018/4/6
 */
public class RandomAccessFileTest {
	
	public static void main(String[] args) {
		new RandomAccessFileTest().test();
	}
	
	public void test() {
		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File("random.txt"), "rw")) {
			randomAccessFile.writeUTF("hello random access!");
			randomAccessFile.seek(0);
			System.out.println(randomAccessFile.readLine());
			randomAccessFile.writeUTF("I love china");
			randomAccessFile.seek(0);
			System.out.println(randomAccessFile.readLine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
