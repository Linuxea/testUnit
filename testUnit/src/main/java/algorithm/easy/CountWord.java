package algorithm.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author Linuxea
 * @version 1.0
 */
//遍历一个字符串，统计出现字母的个数
public class CountWord {
	
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符串便于统计:");
		str = sc.nextLine();
		
		char[] ch = str.toCharArray();//将字符串->字符数组
		
		Map<Character,Integer> maps = new HashMap<>();
		
		for(int i = 0;i<ch.length;i++){
			if(maps.get(ch[i])==null){
				maps.put(ch[i], 1);
			}else{
				maps.put(ch[i],maps.get(ch[i])+1);
			}
		}
		
			//System.out.println("看这里"+maps);
			
			Set<Character> sets = maps.keySet();
			Iterator<Character> iter = sets.iterator();
			
			for(;iter.hasNext();){
				char temp = iter.next();
				System.out.println("字母:"+temp+"出现"+maps.get(temp));
			}
			sc.close();
			sc = null;
	}
}


