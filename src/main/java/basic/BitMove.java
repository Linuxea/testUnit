package basic;

/**
 * 位操作
 *
 * @author linuxea
 * @date 2018/6/6
 */
public class BitMove {
	
	public static void main(String[] args) {
		System.out.println(1 >> 1);
		System.out.println(1 >> 2);
		
		System.out.println(1 << 1);
		System.out.println(1 << 2);
		
		System.out.println(10 >> 1);
		System.out.println(10 >> 2);
		
		int oldSize = 10;
		// arrayList 扩容1.5倍
		int newSize = oldSize + (oldSize >> 1);
		System.out.println(newSize);
	}
	
}
