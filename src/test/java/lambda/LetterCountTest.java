package lambda;

import org.junit.Test;

import java.util.Map;

public class LetterCountTest {

    @Test
    public void test() {
        Map<String, Integer> map = LetterCount.test("abcdefgabcd");
        System.out.println(map);
    }

}