package interceptor;

/**
 * create by linuxea on 2017/8/28 12:00
 **/
public class SayOne implements Interceptor {


	@Override
	public void interceptor(Invocation invocation) {
		try {
			System.out.println(" 1 1 1 ");
			invocation.invoke();
			System.out.println(" 1 1 1 ");
		} finally {
			System.out.println("我是sayone的finally");
		}
	}
}
