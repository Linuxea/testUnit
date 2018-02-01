package interview.xiaju.staticwithstaticblock;

/**
 * Created by Linuxea on 17-11-21.
 */

public class Father {

	static {
		System.out.println("I am a Father static ");
	}

	{
		System.out.println("I am a father static block");
	}

	public Father() {
		System.out.println("I am a father no params construct");
	}

}
