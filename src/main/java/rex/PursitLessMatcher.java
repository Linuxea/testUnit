package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 尽可能少匹配 magic ?
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class PursitLessMatcher {
	
	public void pursitLessMatcher() {
		// \w{2,3}?
		Pattern compile = Pattern.compile("\\w+?");
		String testString = "I think you are right";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
