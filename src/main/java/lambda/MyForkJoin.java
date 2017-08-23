package lambda;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * create by linuxea on 2017/8/23 14:49
 **/
public class MyForkJoin extends RecursiveTask<Long> {

    private static int SPACING = 999999;
    private long[] longs;
    private int start;
    private int end;

    public MyForkJoin(long[] longs, int start, int end) {
        this.longs = longs;
        this.start = start;
        this.end = end;
    }



    @Override
    protected Long compute() {
        if(end - start <= SPACING){
            long sum = 0L;
            for(int i = start;i < end; i++){
                sum += longs[i];
            }
            return sum;
        }else{
            int middle = (end + start) / 2;
            MyForkJoin leftJoin = new MyForkJoin(this.longs, start, middle);
            MyForkJoin rightJoin = new MyForkJoin(this.longs, middle+1, end);
            invokeAll(leftJoin, rightJoin);
            Long leftJoinResult = leftJoin.join();
            Long rightJoinResult = rightJoin.join();
            Long result = leftJoinResult + rightJoinResult;
            System.out.println("result = " + leftJoinResult + " + " + rightJoinResult + " ==> " + result);
            return result;
        }
    }

    public static void main(String[] argc){
//        LongUnaryOperator longUnaryOperator = lon -> (Long.parseLong((int)( Math.random()*99999)+""));
//        long[] longs = LongStream.iterate(0, longUnaryOperator).limit(99999).toArray();

        long[] longs1 = new long[9999999];
        for(int i=0;i<9999999;i++){
            longs1[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        ForkJoinTask<Long> forkJoinTask = new MyForkJoin(longs1,0,longs1.length);
        long result = forkJoinPool.invoke(forkJoinTask);

        System.out.println(result);
    }

}