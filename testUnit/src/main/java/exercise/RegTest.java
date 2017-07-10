package exercise;

import java.util.List;

import org.junit.Test;

/**
 *@date      2017年6月21日 上午10:32:17
 *@desc      class description
 *@version   1.0
 *@author    Linuxea.lin
*/
public class RegTest {
	
	@Test
	public void test1(){
		String str = "[hehe]";
		String newStr = str.replaceAll("(\\[|\\])", "");
		System.out.println(newStr);
		
	}
	
	
	@Test
	public void test2(){
		List<Integer> ins = com.google.common.collect.Lists.newArrayList();
		for(int i = 0;i<100;i++){
			ins.add(i);
		}
		System.out.println(ins);
		for(int i = 0;i<ins.size();i++){
			ins.remove(i);
		}
		System.out.println(ins);
	}
	
	@Test
	public void test3(){
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
		System.out.println(java.time.Instant.now());
		System.out.println(java.time.Instant.now(java.time.Clock.systemDefaultZone()));
		
	}
	

}
