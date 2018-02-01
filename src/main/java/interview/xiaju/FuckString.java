package interview.xiaju;

/**
 * wtf
 * Created by Linuxea on 17-11-21.
 */

public class FuckString {

	public static void change(String string) {
		string = "after change";
	}

	public static void change(StringBuilder stringBuilder) {
		stringBuilder.append(" append");
	}

	public static void main(String[] args) {
		String string = "before change";
		FuckString.change(string);
		System.out.println(string);

		StringBuilder stringBuilder = new StringBuilder("before append");
		FuckString.change(stringBuilder);
		System.out.println(stringBuilder);
	}

}
