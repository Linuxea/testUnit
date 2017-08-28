package interceptor;

import org.junit.Test;
import org.testng.collections.Lists;

import java.lang.reflect.Method;
import java.util.List;

public class InterceptorTest {

    @Test
    public void test1(){
//        testInterceptor(); //需要做代理
        try {

            Invocation invocation = (Invocation) Class.forName("interceptor.Invocation").newInstance();
            Class<?> clazz = Class.forName("interceptor.TestMe");
            Method method = clazz.getMethod("testInterceptor", Invocation.class);
            Before before = method.getAnnotation(Before.class);
            Class<? extends Interceptor>[] interceptors = before.value();
            List<Interceptor> interceptorList = Lists.newArrayList();
            for(int i = 0;i<interceptors.length;i++){
                interceptorList.add(interceptors[i].newInstance());
            }
            invocation.setInterceptors(interceptorList); //偷个懒 这里不用反射
            invocation.invoke();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

    }

}