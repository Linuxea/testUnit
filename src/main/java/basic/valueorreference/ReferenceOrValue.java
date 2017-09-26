package basic.valueorreference;

/**
 * Created by Linuxea on 2017/9/26.
 */
public class ReferenceOrValue {

    static int globalI = 40;

    public void change(int i){
        i = 20;
    }


    public static void main(String[] args) {
        ReferenceOrValue referenceOrValue = new ReferenceOrValue();
        int j = 30;
        referenceOrValue.change(j);
        System.out.println(j);

        referenceOrValue.change(globalI);  // not change
        System.out.println(globalI);       // not change
    }


}
