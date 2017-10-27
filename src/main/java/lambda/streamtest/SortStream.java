package lambda.streamtest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Linuxea on 10/28/17.
 */
public class SortStream {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(2, 12, 553, 12, 235, -9, 100);

        lists.stream().sorted().forEach(System.out::println);
    }
}
