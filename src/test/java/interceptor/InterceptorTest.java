package interceptor;

import org.junit.Test;

import java.lang.reflect.Method;

public class InterceptorTest {

    @Test
    public void test1(){
//        testInterceptor(); //需要做代理
        try {

            Invocation invocation = (Invocation) Class.forName("interceptor.Invocation").newInstance();
            Class<?> clazz = Class.forName("interceptor.test");
            Method method = clazz.getMethod("testInterceptor", Invocation.class);
            Before before = method.getAnnotation(Before.class);
            Class<? extends Interceptor>[] interceptors = before.value();
            int i = 0;
            while (i<interceptors.length){
                interceptors[i++].newInstance().interceptor(invocation);
            }
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

    }

}