package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 后缀匹配
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class SuffixMathc {
	
	public void match() {
		Pattern compile = Pattern.compile("\\b\\w+(?=ing\\b)");
		String testString = "going fucking helloing byebyeing";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
