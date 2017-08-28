package interceptor;

/**
 * create by linuxea on 2017/8/28 13:43
 **/
public class SayFour implements Interceptor {
    @Override
    public void interceptor(Invocation invocation) {
        System.out.println(" 4 4 4 ");
        invocation.invoke();
        System.out.println(" 4 4 4 ");
    }
}
