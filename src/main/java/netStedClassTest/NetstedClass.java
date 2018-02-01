package netStedClassTest;

/**
 * 奇葩的非静态内部类实例化
 */
public class NetstedClass {

	public static void main(String[] args) {
		NetstedClass.Net net = new NetstedClass().new Net();
		net.say();
	}

	private class Net {
		private void say() {
			System.out.println("hello");
		}
	}

}
