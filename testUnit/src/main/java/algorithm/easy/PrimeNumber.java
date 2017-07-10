package algorithm.easy;

/**
 * @author Linuxea 林修论
 * @date   2016年7月21日
 * @description 输入1-1000之间的质数
 * @version 1.0
 * @return 
 */
/*
 * 质数（prime number）又称素数，有无限个
 * 除了1和它本身以外不再被其他的除数整除
 * 根据算术基本定理，每一个比1大的整数，要么本身是一个质数，要么可以写成一系列质数的乘积，最小的质数是2。
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int i ,j,k = 0;
		for(i = 2;i<=1000;i++){
			boolean flag = true;
			for(j = 2;j<=1000;j++){
				if(i!=j){
					if(i%j == 0){
						flag = false;
						continue;
					}
				}
			}
			if(flag){
				System.out.println("我是质数:"+i);
				k++;
			}
				
		}
		System.out.println("总共有"+k+"个质数");
	}
}


