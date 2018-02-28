package basic.clazz.load;

/**
 * ref https://www.zhihu.com/question/54917466/answer/328421286
 *
 * @author linuxea
 * @date 2018/2/28
 */
public class Main {
	
	final static Main main = new Main();
	final static Object _MAIN = instance();
	
	static {
		System.out.println("I basic.clazz.load.am Main static block");
	}
	
	Main() {
		System.out.println("I am basic.clazz.load.Main constructor");
	}
	
	static Object instance() {
		System.out.println("I am static instance");
		return main;
	}
	
}
