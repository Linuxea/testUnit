package reflect.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Linuxea.lin
 * @version 1.0
 * @date 2017年7月7日 下午4:40:59
 * @desc cglib代理测试
 */
public class CglibGenerate<T> implements MethodInterceptor {

	private T target;//增强目标对象

	public CglibGenerate(Class<? extends T> clazz) {
		try {
			this.target = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BaseService service = new CglibGenerate<BaseService>(ServiceImpl.class).power();
		service.add();
		service.delete();
		service.find();
		service.update();
	}

	@SuppressWarnings("unchecked")
	public T power() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);  // 回调方法
		return (T) enhancer.create();   // 创建代理对象
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object result = null;
		System.out.println("开始..");
		result = proxy.invokeSuper(obj, args);
		System.out.println("结束...");
		return result;
	}

}
