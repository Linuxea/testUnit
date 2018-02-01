package interview.yida;

/**
 * 子类访问父类的非私有属性与方法
 */
public class Son extends Father {

	public static void main(String[] args) {
		new Son().say();

		new Son().sonSay();
	}

	public void say() {
		System.out.println(super.name); // visit father non private fields
	}

	public void sonSay() {
		super.fatherSay();
	}

}
