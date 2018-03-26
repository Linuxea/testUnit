package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 结尾匹配
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class EndMatcher {
	
	public void endMatcher() {
		Pattern love$ = Pattern.compile(".*love$", Pattern.MULTILINE);
		String testString = "china i love\n" +
				"beijing i love\n" +
				"guangzhou i love\n" +
				"shantou i best love\n" +
				"you i love not";
		Matcher matcher = love$.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
		
	}
	
}
