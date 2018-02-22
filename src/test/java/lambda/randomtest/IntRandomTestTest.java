package lambda.randomtest;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * @author linuxea
 * @date 2018/2/1
 */
public class IntRandomTestTest {
	
	@Test
	public void intsTest() {
		IntRandomTest intRandomTest = new IntRandomTest();
		IntStream intStream = intRandomTest.intsTest();
		intStream.forEach(System.out::println);
	}
	
}