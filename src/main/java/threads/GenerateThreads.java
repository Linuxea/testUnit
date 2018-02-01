package threads;

/**
 * Created by Linuxea on 11/5/17.
 */

public class GenerateThreads {

	public static void run() {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> System.out.println("hello " + Thread.currentThread().getName())).start();
		}
	}

	public static void main(String[] args) {
//        GenerateThreads.run();
//        while(true);
	}

}
