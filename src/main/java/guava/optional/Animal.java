package guava.optional;

import com.google.common.collect.ComparisonChain;

/**
 * Created by Linuxea on 2017/8/18.
 */
public class Animal {
	
	private Integer age;
	private String name;
	private boolean canFly;
	private boolean canRun;
	
	public Animal(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int compartTo(Animal that) {
		ComparisonChain.start().compare(this.age, that.age).compare(this.name, that.name).result();
		return 0;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isCanFly() {
		return canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean isCanRun() {
		return canRun;
	}
	
	public void setCanRun(boolean canRun) {
		this.canRun = canRun;
	}
}
