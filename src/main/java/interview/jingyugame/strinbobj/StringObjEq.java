package interview.jingyugame.strinbobj;

/**
 * @author linuxea
 * @date 2018/6/5
 */
public class StringObjEq {
	
	public void run() {
		String str = "Hello world";
		String str2 = "Hello " + new String("world");
		String str3 = "Hello " + "world";
		System.out.println(str.equals(str2));
		System.out.println(str == str3);
		System.out.println(str == str2);
		
		// str 与 str2 是两个不一样的对象
		// str 是创建在常量池中的一个 string 字面量 Hello world
		// str2 是通过 stringBuilder 将两个单词拼接起来的新创建对象
		// https://stackoverflow.com/questions/1881922/questions-about-javas-string-pool
	}
	
}
