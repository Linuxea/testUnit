package threads;


/**
 * Created by Linuxea on 2017-08-03.
 */
public class VolatileTest {

    private static class Num{
        int i;
        public int getI(){
            return i;
        }
        public void increment(){
            i+=1;
        }
    }

    public static void main(String[] argc) throws InterruptedException {
        VolatileTest.Num num = new VolatileTest.Num();
        for(int i = 0;i<1000000;i++){
            new Thread(()->{num.increment();}).start();
        }
        while(Thread.activeCount()>2); //why
        System.out.println(num.getI());
    }

}
