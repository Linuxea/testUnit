package basic.clazz;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class GetClassTest {
	
	public static void main(String[] args) {
		Class<? extends String> aClass = "".getClass();
		System.out.println(aClass);
		
		Class<? extends Integer> aClass1 = Integer.valueOf(1).getClass();
		System.out.println(aClass1);
		
		Number n = 9;
		Class<? extends Number> aClass2 = n.getClass();
		System.out.println(aClass2);
		
		
	}
	
}
