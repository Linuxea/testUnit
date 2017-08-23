package lambda;


import org.testng.collections.Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * create by linuxea on 2017/8/23 16:36
 **/
public class LetterCount {

    public static Map<String,Integer> test(String string){
        Map<String,Integer> map = Maps.newHashMap();
        Consumer<String> streamConsumer = str -> {
            Integer currentCount = map.get(str);
            if( currentCount == null)map.put(str,1);
            else map.put(str,currentCount+1);
        };
        Stream.of(string.split("")).forEach(streamConsumer);
        return map;
    }

}
