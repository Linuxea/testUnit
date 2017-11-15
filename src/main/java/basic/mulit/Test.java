package basic.mulit;

public class Test {

    public static void main(String[] args) {

        Student small = new SmallStudent();
        Student big = new BigStudent();

        System.out.println(small instanceof SmallStudent); // true
        System.out.println(big instanceof BigStudent);     // true

        System.out.println(small instanceof BigStudent);    // false
        System.out.println(big instanceof SmallStudent);    // false

        System.out.println(small instanceof Student);       // true
        System.out.println(big instanceof Student);         // true
    }

}
