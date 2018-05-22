package io;

import java.io.*;

/**
 * @author linuxea
 * @date 2018/5/22
 */
public class ObjectIo {
	
	public static void main(String[] args) throws Exception {
		People jiahua = new People("jiahua", 18);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("jiahua")));
		objectOutputStream.writeObject(jiahua);
		objectOutputStream.flush();
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("jiahua")));
		People people = (People) objectInputStream.readObject();
		System.out.println(people);
	}
	
	
}
