package lambda.streamtest;

import org.testng.collections.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 映射流
 * Created by Linuxea on 10/28/17.
 */
public class ReflectStream {

	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(0, 5);
		intStream.mapToDouble(i -> i).forEach(System.out::println);

		IntStream intStream2 = IntStream.rangeClosed(0, 5);
		intStream2.mapToLong(i -> i).forEach(System.out::println);

		List<List<String>> lists = Lists.newArrayList();
		lists.add(Lists.newArrayList("abc", "def"));
		lists.add(Lists.newArrayList("123", "44"));
		lists.add(Lists.newArrayList(",,,.", "-=-"));
		lists.add(Lists.newArrayList("234", "def0."));

		// 流的扁平化操作
		lists.stream().flatMap(l -> Arrays.stream(l.toArray())).forEach(System.out::println);


		System.out.println("################");
		// 字符串流转换为字符流
		// first method:
		Stream<String> stringStream = Stream.of("I love you very much");
		stringStream
				.map(str -> str.split(""))
				.flatMap(Arrays::stream)
				.forEach(System.out::println);

		// second method:
		Stream<String> stringStreamTwo = Stream.of("I love you very much");
		stringStreamTwo
				.map(str -> str.chars())
				.flatMap(iis -> iis.mapToObj(n -> (char) n))
				.forEach(System.out::println);

		// summary : first method is better

	}

}
