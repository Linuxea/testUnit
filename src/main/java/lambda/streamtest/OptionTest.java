package lambda.streamtest;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by Linuxea on 10/28/17.
 */
public class OptionTest {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent());

        Optional<String> stringOptional = Optional.of("a");
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.get());
        stringOptional.ifPresent(s -> System.out.println("this is cool " + s));

        OptionalInt number = OptionalInt.of(2);
        System.out.println(number.getAsInt());

        OptionalInt optionalInt = IntStream.of(1, 3, 5, 6).filter(i -> i % 2 == 0).max();
        optionalInt.ifPresent(i -> System.out.println("ok:" + i));

    }
}
