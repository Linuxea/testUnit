package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * String 过滤器模式
 */
public class StringChain implements Chain<String> {

	/**
	 * 默认实现
	 * @param string
	 * @return
	 */
	@Override
	public String doIt(String string) {
		return string;
	}

	/**
	 * 构造持续调用
	 * @param s
	 * @return
	 */
	@Override
	public final String begin(String s) {
		String string = this.doIt(s);
		if(null != next){
			string = next.begin(string);
		}
		return string;
	}

	private StringChain next;

	public StringChain getNext() {
		return next;
	}

	public void setNext(StringChain next) {
		this.next = next;
	}


}
