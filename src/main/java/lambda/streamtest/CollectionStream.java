package lambda.streamtest;

import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Linuxea on 10/28/17.
 */
public class CollectionStream {

    public static void main(String[] args) {

        List<String> stringList = Lists.newArrayList("i", "love", "china");

        List<String> newList =
                stringList.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(newList);

        List<String> newnewList =
                stringList.stream().collect(Collectors.toList());
        System.out.println(newnewList);
    }

}
