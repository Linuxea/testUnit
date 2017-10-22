package code;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Created by Linuxea on 10/23/17.
 */
public class BaseCode {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        byte[] abc = Base64.getEncoder().encode("One day one apple, doctor get out.".getBytes());
        System.out.println(Arrays.toString(abc));

        //解码
        byte[] cde = Base64.getDecoder().decode(abc);
        System.out.println(new String(cde, "utf-8"));
    }

}
