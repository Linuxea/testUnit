package lambda.streamtest;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Linuxea on 10/28/17.
 */
public class StreamGenerate {

    // generate iterate

    public static void main(String[] args) {

        // 有序流
        IntStream intStream = IntStream.iterate(1, i -> i *= 2).limit(11);
        intStream.forEach(System.out::println);


        Stream.iterate(2L, n -> n + 1)
                .filter(StreamGenerate::isOdd)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("########################");

        // 无序流 generate(Supplier<T> s)使用Supplier来生成无限顺序无序流。
        IntSupplier intSupplier = () -> new Random().nextInt(999);
        IntStream generateStream = IntStream.generate(intSupplier).limit(10);
        generateStream.forEach(System.out::println);

        System.out.println("################");
        new Random().ints().limit(4).forEach(System.out::println);

        System.out.println("################");
        IntStream.of(1, 1, 2, 3, 4, 4, 5).distinct().forEach(System.out::println);
    }


    public static boolean isOdd(long number) {
        return number % 2 != 0;
    }

}
