package interceptor;

/**
 * create by linuxea on 2017/8/28 12:04
 **/
public class SayThree implements Interceptor {


    @Override
    public void interceptor(Invocation invocation) {
    	try {
			System.out.println(" 3 3 3 ");
			invocation.invoke();
			System.out.println(" 3 3 3 ");
		}
         finally {
			System.out.println("我是SayThree的finally");
		}
    }
}
