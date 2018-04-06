package basic.file.random;

import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/**
 * @author linuxea
 * @date 2018/4/6
 */
public class ReadAndWrite {
	
	private final static String FILE_PATH_WITH_NAME = "readAndWrite.txt";
	private final RandomAccessFile randomAccessFile;
	
	private ReadAndWrite(RandomAccessFile randomAccessFile) {
		this.randomAccessFile = randomAccessFile;
	}
	
	public static void main(String[] args) {
		RandomAccessFile randomAccessFile = null;
		try {
			randomAccessFile = new RandomAccessFile(FILE_PATH_WITH_NAME, "rw");
			ReadAndWrite readAndWrite = new ReadAndWrite(randomAccessFile);
			// read 按字节读取 三个字节一个中文(in most case) utf-8编码
			byte[] read = readAndWrite.read(3, 12);
			String string = StringUtils.toEncodedString(read, Charset.defaultCharset());
			System.out.println("read result: " + string);
			
			// write start 超过 end 也无效
			// 会覆盖
			readAndWrite.write(100, "我是新r 来的");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != randomAccessFile) {
					randomAccessFile.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param start
	 * @param size
	 * @return
	 */
	public byte[] read(int start, int size) {
		try {
			byte[] bytes = new byte[size];
			randomAccessFile.seek(start);
			randomAccessFile.read(bytes);
			return bytes;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param start
	 * @param data
	 */
	public void write(int start, String data) {
		byte[] bytes = data.getBytes();
		try {
			this.randomAccessFile.seek(start);
			this.randomAccessFile.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
