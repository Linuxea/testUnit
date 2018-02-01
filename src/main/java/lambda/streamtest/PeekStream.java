package lambda.streamtest;

import org.testng.collections.Lists;

import java.util.List;

/**
 * 通过 peek 接口再查看结果内部迭代的eate by Linuxea on 10/28/17.
 */
public class PeekStream {
	
	public static void main(String[] args) {
		
		List<Integer> integers = Lists.newArrayList(1, 2, 3);
		
		integers.stream().peek(i -> System.out.println("stream :" + i))
				.filter(i -> i % 2 == 0)
				.peek(i -> System.out.println("filter :" + i))
				.map(i -> i *= 2)
				.peek(i -> System.out.println("map :" + i))
				.forEach(System.out::println);
	}
	
}
