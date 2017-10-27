package lambda.streamtest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * collection stream
 * Created by Linuxea on 10/28/17.
 */
public class ColectionStream {

    public static void main(String[] args) {

        // 数组流
        IntStream intStream = Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 9});
        intStream.forEach(System.out::println);

        Stream<String> stringStream = Arrays.stream(new String[]{"abc", "cde", "efg"});
        stringStream.forEach(System.out::println);

    }

}
