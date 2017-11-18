package ThreeHundersQs;/**
 * Created by Linuxea on 17-11-18.
 */

/**
 * create by linuxea
 * create on 17-11-18
 **/
public class Demo4 {

    public static void print() {
        System.out.println((new Integer(1)));
        System.out.println(new Integer(2).equals(new Integer(2)));

        Integer i = 102;
        Integer j = new Integer(102);
        System.out.println(i == j); // false
        System.out.println(i.equals(j));  // true

    }

    public static void main(String[] args) {
        Demo4.print();
    }

}
