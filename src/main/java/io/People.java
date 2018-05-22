package io;

import java.io.Serializable;

/**
 * @author linuxea
 * @date 2018/5/22
 */
public class People implements Serializable {
	
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
