package testUnit.algorithm;


/**
 * @author Linuxea
 * @date 2016年7月29日 上午1:08:40
 * @version 1.0
 * @description Calculate the sum of two integers a and b, but you are not
 *              allowed to use the operator + and -.
 **/
public class TwoIntegerAdd {
	public int getSum(int a, int b) {
		int sum,carry;  
        do{  
            sum = a ^ b;  
            carry = (a&b) <<1;  
            a = sum;  
            b = carry;  
        }while(b!=0);  
        return a;  
	}
	
	public static void main(String[] args) {
		
		System.out.println(new TwoIntegerAdd().getSum(3, 2));
	}
}
