package lambda;

import com.google.common.base.Joiner;
import org.junit.Test;
import org.testng.collections.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorStreamTest {

    @Test
    public void test(){
        List<String> stringList = Lists.newArrayList("linuxea","l_kimboo","jina","floer","vicky","bonnie");
        String string = stringList.stream()
                .filter(s -> s.length() > 3)
                .filter(s -> s.startsWith("l"))
                .collect(Collectors.joining("*"));
        System.out.println(string);

        String newString = stringList.stream().collect(Collectors.joining("','"));
        System.out.println("'" + newString + "'");
    }


    @Test
    public void test2(){
        List<String[]> strings = Lists.newArrayList();
        strings.add(new String[]{"linuxea","kimboo","jacky"});
        strings.add(new String[]{"orange","fruit","pony"});
        strings.add(new String[]{"miaoMi","linuxea","kimmy"});
        List<String[]> list = strings.stream().distinct().collect(Collectors.toList());
        Consumer<String[]> consumer = strArr -> System.out.println(Arrays.toString(strArr));
        list.stream().forEach(consumer);
        System.out.println("ok");

        //thinking...  方法引用能否再套方法引用

        Function<String[], String> function
                = stringArr2 -> Joiner.on(",").join(stringArr2);
        strings.stream().map(function).forEach(System.out::println);

    }


    /**
     * 流的扁平化操作
     */
    @Test
    public void test3(){
        List<String[]> strings = Lists.newArrayList();
        strings.add(new String[]{"linuxea","kimboo","jacky"});
        strings.add(new String[]{"orange","fruit","pony"});
        strings.add(new String[]{"miaoMi","linuxea","kimmy"});

        strings.stream().flatMap(Arrays::stream).forEach(System.out::println);

    }

    /**
     * 实现一个String flatMap
     */
    @Test
    public void myStringFlatMap(){

        List<String[]> strings = Lists.newArrayList();
        strings.add(new String[]{"linuxea","kimboo","jacky"});
        strings.add(new String[]{"orange","fruit","pony"});
        strings.add(new String[]{"miaoMi","linuxea","kimmy"});

        Function<String[], Stream<String>> bibiString = stringArray -> Stream.of(stringArray);
        Consumer<String[]> consumer = stringArr -> System.out.println(Arrays.toString(stringArr));
        strings.stream().flatMap(bibiString).map(s -> s.split("")).forEach(consumer);
    }

    @Test
    public void test4(){

        List<String[]> strings = Lists.newArrayList();
        strings.add(new String[]{"linuxea","kimboo","jacky"});
        strings.add(new String[]{"orange","fruit","pony"});
        strings.add(new String[]{"miaoMi","linuxea","kimmy"});

    }

    /**
     * 流扁平化案例
     */
    @Test
    public void test5(){
        String[] strings = null;
        strings = new String[]{"linuxeaa","kimboo","jacky"};
        List<String> stringList = Arrays
                .stream(strings)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(stringList);

    }


    /**
     * 机智如我
     * 今天任务完成
     */
    @Test
    public void test8(){

        List<String[]> strings = Lists.newArrayList();
        strings.add(new String[]{"linuxea","kimboo","jacky"});
        strings.add(new String[]{"orange","fruit","pony"});
        strings.add(new String[]{"miaoMi","linuxea","kimmy"});

        strings
                .stream()
                .flatMap(Arrays::stream)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }


}
