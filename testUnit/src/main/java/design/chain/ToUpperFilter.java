package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * String 过滤器之变大写
 */
public class ToUpperFilter extends StringChain {


	@Override
	public String doIt(String string) {
		return string.toUpperCase();
	}
}
