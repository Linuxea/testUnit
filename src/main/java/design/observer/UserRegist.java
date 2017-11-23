package design.observer;

import org.testng.collections.Lists;

import java.util.List;

/**
 * create by linuxea on 17-11-23
 **/
public class UserRegist implements Obserable {

    private List<Observer> observerList = Lists.newArrayList();

    @Override
    public void regist(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void nofity() {
        for (Observer observer : observerList) {
            observer.receive("hehe");
        }
    }
}
