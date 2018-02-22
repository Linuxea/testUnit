package basic.cons;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class Son extends Parent {
	
	private String name;
	private int age;
	
	/**
	 * 需要默认调用父类的无参构造
	 * 否则需要显式调用某个父类的某个有参构造
	 */
	Son(String name, int age) {
		super(name, age);
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
		return "Son{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
