package practice_7.Generic;

/**
 * Created by OmeN on 13.04.2016.
 */

class TwoGeneric<K, V> {
    K obj1;
    V obj2;

    public TwoGeneric(K obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "TwoGeneric{" +
                "obj1=" + obj1 + " " + obj1.getClass().getName() +
                ", obj2=" + obj2 + " " + obj2.getClass().getName() +
                '}';
    }
}
public class Test_two_generic {

    public static void main(String[] args) {
        TwoGeneric<Integer, String> test = new TwoGeneric<Integer, String>(666, "wtf?");
        System.out.println(test);
    }
}
