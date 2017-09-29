package interceptor;

/**
 * create by linuxea on 2017/8/28 12:04
 **/
public class SayTwo implements Interceptor {

    @Override
    public void interceptor(Invocation invocation) {
       try{
		   System.out.println(" 2 2 2 ");
		   invocation.invoke();
		   System.out.println(" 2 2 2");
	   }
        finally {
			System.out.println("我是SayTwo的finally");
		}
    }
}
