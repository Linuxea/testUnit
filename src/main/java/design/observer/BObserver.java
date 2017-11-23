package design.observer;

/**
 * create by linuxea on 17-11-23
 **/
public class BObserver implements Observer {


    @Override
    public void receive(String msg) {
        System.out.println("i am b");
    }
}
