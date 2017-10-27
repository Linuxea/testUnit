package lambda.streamtest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Linuxea on 10/28/17.
 */
public class For2Stream {

    public static void main(String[] args) {

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        lists.stream().filter(i -> i % 2 == 0).map(n -> n * n).forEach(System.out::println);

        int sum = lists.stream().filter(i -> i % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
