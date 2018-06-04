package interview.jingyugame.ov;

/**
 * 方法的重写不可以改变返回类型
 *
 * @author linuxea
 * @date 2018/6/5
 */
public class Son extends Father {
	
	@Override
	protected String say() {
		return "我是儿子";
	}
}
