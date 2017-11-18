package ThreeHundersQs;/**
 * Created by Linuxea on 17-11-18.
 */

/**
 * create by linuxea
 * create on 17-11-18
 **/
public class Demoo5 {

    public static void print() {
        byte b = 127; // byte between -128 - 127
//        1 + 2 + 4 + 8 + 16 + 32 + 64 + 128 = 255
        System.out.println(b);

        char c = 65535;  // use 2 bytes = 16 bits 0~65535
        System.out.println(c);
    }


    public static void main(String[] args) {
        Demoo5.print();
    }

}
