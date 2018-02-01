package design.chain;

import com.google.common.base.Joiner;

/**
 * Created by Linuxea on 2017/8/10.
 */
public class JoinFilter extends StringChain {
	
	@Override
	public String doIt(String string) {
		return Joiner.on("-").join(string.replaceAll("\\s+", "").split(""));
	}
}