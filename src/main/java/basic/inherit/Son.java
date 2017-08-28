package basic.inherit;

/**
 * @author Linuxea.lin
 * @version 1.0
 * @date 2017年7月11日 上午10:28:01
 * @desc class description
 */
public class Son extends Father {

    @Override
    public void say() {
        System.out.println("我是儿子");
    }

    public void fatherSay() {
        super.say();
    }

    public void grandSay() {

    }
}
