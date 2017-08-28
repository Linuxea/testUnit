package basic.inherit;

/**
 * @author Linuxea.lin
 * @version 1.0
 * @date 2017年7月11日 上午10:26:01
 * @desc 爷爷类
 */
public class GrandFather implements Person {

    @Override
    public void say() {
        System.out.println("我是爷爷");
    }


}
