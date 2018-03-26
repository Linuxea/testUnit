package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 前缀匹配
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class PreMatch {
	
	final Pattern compile = Pattern.compile("(?<=fuck)\\w+");
	
	public void match() {
		String testString = "fuckone fuctwo fuckthree fuckfour";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
