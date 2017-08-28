package interceptor;

/**
 * create by linuxea on 2017/8/28 12:04
 **/
public class SayThree implements Interceptor {


    @Override
    public void invode(Invocation invocation) {

        System.out.println(" 3 3 3 ");
        invocation.invoke();
        System.out.println(" 3 3 3 ");

    }
}
