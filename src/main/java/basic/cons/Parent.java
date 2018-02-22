package basic.cons;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class Parent {
	
	private String name;
	private int age;
	
	private Parent() {
	}
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(toString());
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
		return "Parent{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
