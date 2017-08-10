package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * String 过滤器模式
 */
public class StringFilter implements Chain<String> {

	private StringFilter next;

	public StringFilter getNext() {
		return next;
	}

	public void setNext(StringFilter next) {
		this.next = next;
	}


	/**
	 * 默认实现
	 * @param string
	 * @return
	 */
	@Override
	public String doIt(String string) {
		return string;
	}

	@Override
	public final String begin(String s) {
		String string = this.doIt(s);
		if(null != next){
			string = next.begin(string);
		}
		return string;
	}


}
