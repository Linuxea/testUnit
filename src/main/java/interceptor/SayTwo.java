package interceptor;

/**
 * create by linuxea on 2017/8/28 12:04
 **/
public class SayTwo implements Interceptor {

    @Override
    public void interceptor(Invocation invocation) {
        System.out.println(" 2 2 2 ");
        invocation.invoke();;
        System.out.println(" 2 2 2");
    }
}
