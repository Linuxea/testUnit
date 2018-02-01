package design.chain;

/**
 * Created by Linuxea on 2017/8/10.
 * chain的最高抽象
 */
public interface Chain<T> {
	
	T doIt(T t);
	
	T begin(T t);
	
}
