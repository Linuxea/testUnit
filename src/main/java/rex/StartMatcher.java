package rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 开始匹配
 *
 * @author linuxea
 * @date 2018/3/26
 */
public class StartMatcher {
	
	public void startMatcher() {
		// 多行模式
		Pattern compile = Pattern.compile("^i.*", Pattern.MULTILINE);
		String testString =
				"i love china\n" +
						"i love world\n" +
						"i love beijing\n" +
						"i love shantou\n" +
						"i love you\n" +
						"hello\n";
		Matcher matcher = compile.matcher(testString);
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}
	
}
