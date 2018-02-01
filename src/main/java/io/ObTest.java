package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @author linuxea
 * @date 17-11-30
 **/
public class ObTest {
	
	static PiKaQ piKaQ = new PiKaQ(1, "me");
	
	/**
	 * obj2byte
	 *
	 * @return
	 * @throws Exception
	 */
	public static byte[] obj2By() throws Exception {
		byte[] bytes;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(piKaQ);
		oos.close();
		bytes = baos.toByteArray();
		baos.close();
		System.out.println(Arrays.toString(bytes));
		return bytes;
	}
	
	/**
	 * byte2obj
	 *
	 * @throws Exception
	 */
	public static void by2Obj() throws Exception {
		byte[] bytes = ObTest.obj2By();
		Object ob;
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
		ob = ois.readObject();
		ois.close();
		System.out.println(ob);
		
	}
	
	public static void main(String[] args) {
		try {
			ObTest.by2Obj();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
