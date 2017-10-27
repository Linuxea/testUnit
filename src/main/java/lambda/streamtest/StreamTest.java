package lambda.streamtest;

import java.util.stream.Stream;

/**
 * Created by Linuxea on 10/28/17.
 */
public class StreamTest {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("abc", "def", "HIJ", "kvF");
        stringStream.map(String::toUpperCase).forEach(System.out::println);

        Stream<String> stringStream1 =
                Stream.<String>builder()
                        .add("ab").add("cde").add("shit").build();
        // what the hell? write format?
        stringStream1.forEach(System.out::println);
    }

}
