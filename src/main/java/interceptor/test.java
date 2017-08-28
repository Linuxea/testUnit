package interceptor;

/**
 * create by linuxea on 2017/8/28 12:19
 **/
public class test {

    @Before({SayOne.class,SayTwo.class, SayThree.class})
    public void testInterceptor(Invocation invocation){
        invocation.invoke();
    }
}
