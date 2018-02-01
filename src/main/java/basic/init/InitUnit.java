package basic.init;

/**
 * create by linuxea on 17-11-22
 */
public class InitUnit {

	static {
		System.out.println("static");
	}

	{
		// only mean before constructor
		System.out.println("block");
	}

	public InitUnit() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("begin");
		new InitUnit();
		new InitUnit();
		System.out.println("end");
	}

}
