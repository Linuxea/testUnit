package lambda.randomtest;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author linuxea
 * @date 2018/2/1
 */
public class IntRandomTest {

	public IntStream intsTest() {
		Random random = new Random();
		IntStream ints = random.ints(0, 10);
		return ints.limit(10);
	}

}
