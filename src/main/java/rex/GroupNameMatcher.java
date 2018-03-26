package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author linuxea
 * @date 2018/3/26
 */
public class GroupNameMatcher {
	
	public void groupNameMatcher() {
		Pattern compile = Pattern.compile("(?<hello>\\w+)");
		String testString = "I love you very much, china";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			System.out.println(matcher.group("hello"));
		}
	}
	
}
