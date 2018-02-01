package lambda.streamtest;

import org.testng.collections.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * join stream
 * Created by Linuxea on 10/28/17.
 */
public class JoinStream {
	
	public static void main(String[] args) {
		
		List<String> stringList = Lists.newArrayList("I", "love", "you", "very", "much");
		String string = stringList.stream().collect(Collectors.joining(" "));
		System.out.println(string);
	}
}
