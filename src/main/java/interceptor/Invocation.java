package interceptor;

import java.lang.reflect.Method;

/**
 * 递归执行拦截器
 * create by linuxea on 2017/8/28 12:02
 **/
public class Invocation {

    private Class<? extends Controller> controllerClazz;
    private Class<? extends Interceptor>[] interceptors;
    private String methodName;
    private Method method;
    private int index = 0;


    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Class<? extends Controller> getControllerClazz() {
        return controllerClazz;
    }

    public void setControllerClazz(Class<? extends Controller> controllerClazz) {
        this.controllerClazz = controllerClazz;
    }

    public Class<? extends Interceptor>[] getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(Class<? extends Interceptor>[] interceptors) {
        this.interceptors = interceptors;
    }

    /**
     * 主要代码
     */
    public void invoke(){
        if(index < interceptors.length){
            try {
                interceptors[index++].newInstance().interceptor(this);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }else if(index++ == interceptors.length){
            try {
                Controller controller = controllerClazz.newInstance();
                controllerClazz.getMethod(methodName).invoke(controller); // 无参构造器
            } catch (ReflectiveOperationException e) {
                e.printStackTrace();
            }
        }

    }


}
