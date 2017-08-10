package design.chain;

import com.google.common.base.CharMatcher;

/**
 * Created by Linuxea on 2017/8/10.
 * String 过滤器之去掉数字
 */
public class FilterDightFilter extends StringChain {


	@Override
	public String doIt(String t) {
		return CharMatcher.digit().removeFrom(t);
	}
}
