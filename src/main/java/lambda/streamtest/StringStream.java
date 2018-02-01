package lambda.streamtest;

/**
 * string stream
 * Created by Linuxea on 10/28/17.
 */
public class StringStream {

	public static void main(String[] args) {

		String string = "I love you very much while you don't love me";
		// chars return IntStream
		string.chars().forEach(System.out::println);

	}

}
