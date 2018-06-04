package interview.jingyugame.short_cast;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class ShortCast {
	
	public void run() {
		short sh = 1;
//		以下一行代码会报错 short + int 的结果为 int ，需要强制类型转换
//		sh = sh + 1;

//		以下一行不会报错 隐式类型转换
//		sh += 3;

// 		程序中显式数字没有指定类型默认为 int 型
		System.out.println(2);
		
	}
	
}
