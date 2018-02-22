package random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author linuxea
 * @date 2018/2/22
 */
public class ThreadLocalRandomTest {
	
	public static void main(String[] args) {
//		ThreadLocalRandom.current().doubles().limit(10).forEach(System.out::println);
//		ThreadLocalRandom.current().ints().limit(10).distinct().forEach(System.out::println);
		ThreadLocalRandom.current().ints(0, 10).limit(10).forEach(System.out::println);
	}
	
}


