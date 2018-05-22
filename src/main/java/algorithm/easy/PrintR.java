package algorithm.easy;

/**
 * @author linuxea
 * @date 2018/5/2
 */
public class PrintR {
	
	public static void main(String[] args) {
		new PrintR().printMe(10);
		new PrintR().printMeToo(10);
	}
	
	private void printMe(int n) {
		System.out.println(n);
		if (n-- > 0) {
			printMe(n);
		}
	}
	
	private void printMeToo(int n) {
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}
