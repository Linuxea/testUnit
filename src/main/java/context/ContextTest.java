package context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

/**
 * Created by Linuxea on 2017-09-02.
 */
public class ContextTest {

    @Before
    public void before(){
    }

    @After
    public void after(){
    }


    @Test
    public void test(){
        URL url =
                Thread.currentThread().getContextClassLoader().getResource(".");
        System.out.println(url);

        File root = new File(url.toString().substring(url.toString().indexOf("/")));

        System.out.println(root.getName());

    }

}
