package design.observer;

/**
 * create by linuxea on 17-11-23
 **/
public class Main {
	
	public static void main(String[] args) {
		AObserver aObserver = new AObserver();
		BObserver bObserver = new BObserver();
		
		UserRegist userRegist = new UserRegist();
		userRegist.regist(aObserver);
		userRegist.regist(bObserver);
		
		userRegist.nofity();
	}
	
}
