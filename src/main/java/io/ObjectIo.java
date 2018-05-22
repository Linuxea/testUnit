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
	
	
	private static class People implements Serializable {
		
		public String name;
		public int age;
		
		public People() {
		}
		
		public People(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "People{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}
	
}
