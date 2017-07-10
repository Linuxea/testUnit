package exercise;

import org.junit.Test;

/**
 *@date      2017年7月3日 下午2:30:34
 *@desc      class description
 *@version   1.0
 *@author    Linuxea.lin
*/
public class CompareTest {
	
	@Test
	public void test1(){
		int i = 1,j = 2;
		if(java.math.BigDecimal.valueOf(i).compareTo( java.math.BigDecimal.valueOf(j)) > 0){
			System.out.println("greater");
		}else{
			System.out.println("less");
		}
	}
	
}
