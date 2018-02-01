package interview.xiaju;

/**
 * Created by Linuxea on 17-11-21.
 */

public class FirstStatic {
	
	static {
		System.out.println("I a static");
	}
	
	{
		System.out.println("I am a non static block");
	}
	
	public static void main(String[] args) {
		new FirstStatic();
		new FirstStatic();
	}
	
}
