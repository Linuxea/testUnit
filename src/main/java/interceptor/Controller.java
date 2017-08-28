package interceptor;

/**
 * 模拟controller
 * create by linuxea on 2017/8/28 18:02
 **/
public class Controller {

    @Before({SayOne.class,SayTwo.class, SayThree.class, SayFour.class})
    public void hello(){
        System.out.println("this is from controller hello");
    }

}
