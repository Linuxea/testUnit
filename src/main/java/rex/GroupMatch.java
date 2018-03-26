package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 分组匹配
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class GroupMatch {
	
	private final Pattern compile = Pattern.compile("\\w+\\s*");
	
	public void group() {
		String testString = "I love you very much.";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
