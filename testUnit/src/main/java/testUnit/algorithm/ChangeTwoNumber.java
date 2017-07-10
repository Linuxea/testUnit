package testUnit.algorithm;

public class ChangeTwoNumber {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		int c = a+b;
		a = c-a;
		b = c-a;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}


