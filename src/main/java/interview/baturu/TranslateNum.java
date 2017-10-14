package interview.baturu;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 一道面试题
 * 对给定一个小于1000的正整数映射成中文表达
 * 没有什么特殊的技巧， 对于特殊的情况添加条件分支
 * 因为特殊情况并不多，所以这种方式最简单 
 * 对输入数字进行预检测
 * 以及尾数“零”的处理
 * 主要考察点在于细节上
 * 难过 :)
 *
 * @author linuxea.lin
 *
 */
public class TranslateNum {
	
	private static Map<String,String> map = Maps.newHashMap();
	
	public static void sc(int x){
		init();
		check(x);
		if( x >= 0 && x <= 9 ){
			System.out.println(map.get(x+""));
		}else if( x>=10 && x <= 99 ){
			StringBuilder temp = new StringBuilder();
			String[] strArr = String.valueOf(x).split("");
			temp.append(map.get(strArr[0])).append("十");
			temp.append(map.get(strArr[1]));
			System.out.println(postCheck(temp));
		}else{
			StringBuilder temp = new StringBuilder();
			String[] strArr = String.valueOf(x).split("");
			temp.append(map.get(strArr[0])).append("百");
			if(strArr[1].equals("0")){
				temp.append(map.get(strArr[1]));
			}else{
				temp.append(map.get(strArr[1])).append("十");
			}
			temp.append(map.get(strArr[2]));
			System.out.println(postCheck(temp));
		}
	}

	
	/**
	 * 从倒数开始删除连续的零
	 * @param temp
	 * @return
	 */
	private static String postCheck(StringBuilder temp) {
		char[] arr = temp.toString().toCharArray();
		int i = arr.length - 1 ;
        for (int k = i; i > 0 && Character.valueOf(arr[k--]).toString().equals("零"); ) {
            i = k; // tip
        }
        return temp.subSequence(0, i+1).toString();
	}

	/**
	 * 入参检查
	 * 借助编译器
	 * @param x
	 */
	private static void check(int x) {
		if( x <= 0  || x > 999){
			throw new IllegalArgumentException("数字必须在[1,999]");
		}
	}

	private static void init() {
		map.put(0+"", "零"); map.put(1+"", "一"); map.put(2+"", "二"); map.put(3+"", "三"); map.put(4+"", "四"); 
		map.put(5+"", "五"); map.put(6+"", "六"); map.put(7+"", "七"); map.put(8+"", "八"); map.put(9+"", "九");
	}
	
	public static void main(String[] args) {
        TranslateNum.sc(39);
    }
	
}
