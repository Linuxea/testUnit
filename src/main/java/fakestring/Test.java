package fakestring;

/**
 * 无法自定义一个 java.lang 包等非法操作
 */
public class Test {
	
	
	public static void main(String[] args) {
		
		String string = new String();
		System.out.println(string.getClass().getClassLoader()); // null bootstrap classloader
		
		Person person = new Person(1, "linuxea");
		System.out.println(person.getClass().getClassLoader()); // sun.misc.Launcher$AppClassLoader@18b4aac2
		
		
		Integer integer = new Integer(11);
		System.out.println(integer.getClass().getClassLoader());
		
		
	}
	
}

class Person {
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
