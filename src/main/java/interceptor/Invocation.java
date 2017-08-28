package interceptor;

import java.util.List;

/**
 * 递归执行拦截器
 * create by linuxea on 2017/8/28 12:02
 **/
public class Invocation {

    private List<Interceptor> interceptors;
    private int index = 0;


    public List<Interceptor> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<Interceptor> interceptors) {
        this.interceptors = interceptors;
    }

    /**
     * 主要代码
     */
    public void invoke(){
        if(index < interceptors.size()){
            interceptors.get(index++).interceptor(this);
        }else if(index++ == interceptors.size()){
            System.out.println("我是核心");
        }
    }


}
