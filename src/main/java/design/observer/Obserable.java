package design.observer;

/**
 * create by linuxea on 17-11-23
 **/
public interface Obserable {

    void regist(Observer observer);

    void nofity();

}
