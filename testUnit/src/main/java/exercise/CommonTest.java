package exercise;

import java.math.BigDecimal;

import org.junit.Test;

/**
 *@date      2017年6月21日 下午8:08:10
 *@desc      class description
 *@version   1.0
 *@author    Linuxea.lin
*/
public class CommonTest {
	
	@Test
	public void test1(){
		
		System.out.println( 12/13);
		
		BigDecimal rs = java.math.BigDecimal.valueOf(12).divide(new java.math.BigDecimal(13), 2);
		System.out.println(rs);
	}
	
	@Test
	public void test2(){
		System.out.println( (1+0.0 )/1.0 );
	}
	
}
