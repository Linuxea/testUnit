package algorithm.easy;


/**
 * 辗转相除法求最大公约数
 * 两个数的最大公约数是指能同时整除它们的最大正整数
 * references:https://baike.baidu.com/item/%E8%BE%97%E8%BD%AC%E7%9B%B8%E9%99%A4%E6%B3%95/4625352
 * @author linuxea.lin
 *
 */
public class MaxYue {
	
	public static int fu(int x, int y){
		
		return y == 0 ? x : fu(y, x%y);
		
	}
	
	public static void main(String[] args) {
		int result = MaxYue.fu(30, 20);
		System.out.println(result);
	}

}
