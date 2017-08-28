package interceptor;

import org.junit.Test;
import java.lang.reflect.Method;

public class InterceptorTest {

    @Test
    public void test1(){
//        testInterceptor(); //需要做代理
        try {
            Class<? extends Controller> controllerClazz = (Class<? extends Controller>) Class.forName("interceptor.Controller");
            Invocation invocation = (Invocation) Class.forName("interceptor.Invocation").newInstance();
            Class<?> clazz = Class.forName("interceptor.Controller");
            Method method = clazz.getMethod("hello");
            Before before = method.getAnnotation(Before.class);
            Class<? extends Interceptor>[] interceptors = before.value();
            invocation.setInterceptors(interceptors); //偷个懒 这里不用反射
            invocation.setControllerClazz(controllerClazz);
            invocation.setMethodName("hello"); //实际场景需要根据url来解析
            invocation.invoke();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

    }

}