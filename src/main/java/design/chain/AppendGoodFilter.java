package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * String 过滤器之添加结尾
 */
public class AppendGoodFilter extends StringChain {

	@Override
	public String doIt(String t) {
		t += " filter end!";
		return t;
	}
}
