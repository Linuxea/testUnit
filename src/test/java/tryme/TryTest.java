package tryme;

import org.junit.Test;

/**
 * create by linuxea on 2017/9/1 12:20
 **/
public class TryTest {

    @Test
    public void testReturn(){
        try{
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("over");
        }
    }

    @Test
    public void testReturn2(){
        try{
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            return;
        }finally {
            System.out.println("over");
        }
    }

    @Test
    public void testReturn3(){
        try{
            int i = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }finally {
            System.out.println("over"); // System.exit 虚拟机退出 finally块不一定执行
        }
    }


}
