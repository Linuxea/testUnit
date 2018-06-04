package interview.jingyugame.short_cast;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class ConstantExpressionMe {
	
	public void errorRun() {
		int i = 3;
//		error
//		byte b = i;
	}
	
	public void rightRun() {
		int i = 3;
		byte b = (byte) i;
		System.out.println(b);
	}
	
	public void beautifulRun() {
		// 3 是整形字面量(integer literal) 也是 常量表达式(constant expression)
		// java 能够对常量表达式(constant expression) 进行隐匿地类型转换
		// 添加 final 将 i 声明为常量表达式 (constant expression)
		final int i = 3;
		byte b = i;
		System.out.println(b);
	}
	
	
}
