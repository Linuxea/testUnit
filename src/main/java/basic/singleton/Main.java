package basic.singleton;


/**
 * Created by Linuxea on 17-11-25.
 */

public class Main {
	
	public static void main(String[] args) {
		ControllerA controllerA = new ControllerA();
		ControllerA controllerA1 = new ControllerA();
		System.out.println(controllerA == controllerA1);
		// instance can not access static field
		System.out.println(ControllerA.getServiceA() == ControllerA.getServiceA());
	}
}
