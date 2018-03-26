package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author linuxea
 * @date 2018/3/26
 */
public class GreedyMatcher {
	
	public void greedyMatcher() {
		Pattern compile = Pattern.compile("(?>\\w+,?)");
		String testString = "I love you very much, china";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
