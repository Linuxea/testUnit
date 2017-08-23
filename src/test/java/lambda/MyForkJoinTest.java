package lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;


public class MyForkJoinTest {

    private static long LENGTH = 99999999L;

    private long[] longs1;

    @Before
    public void before(){
        longs1 = LongStream.rangeClosed(0,LENGTH).toArray();
    }

    @Test
    public void test0(){
        long sum = 0;
        for(int i = 0;i<longs1.length;i++){
            sum += longs1[i];
        }
        System.out.println(sum);
    }

    @Test
    public void test1(){
        System.out.println(Arrays.stream(longs1).sum());
    }

    @Test
    public void test2(){
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        ForkJoinTask<Long> forkJoinTask = new MyForkJoin(longs1,0,longs1.length);
        long result = forkJoinPool.invoke(forkJoinTask);
        System.out.println(result);
    }

}