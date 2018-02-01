package basic.valueorreference;

/**
 * Created by Linuxea on 2017/9/26.
 */
public class IntegerChange {

	public static void main(String[] args) {
		Integer integer = 0;
		change(integer);
		System.out.println("main" + integer); // still not change
	}

	private static void change(Integer integer) {
		integer = 3;
		System.out.println("change" + integer);
	}

}
