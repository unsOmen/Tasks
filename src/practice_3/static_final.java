package practice_3;

import java.util.Random;

/**
 * Created by OmeN on 22.03.2016.
 */

class Test {
    private static Random rnd = new Random(47);
    public static final int A = rnd.nextInt(10);
    public final int B = rnd.nextInt(10);
}

class Test2 {
    public final Test myTest;

    Test2() {
        myTest = new Test();
    }

}
public class static_final {
    public static void main(String[] args) {
        Test tt = new Test();
        System.out.println(tt.A);
        System.out.println(tt.B);

        Test tt1 = new Test();
        System.out.println(tt1.A);
        System.out.println(tt1.B);

        Test2 tt2 = new Test2();
        System.out.println(tt2.myTest.A);
        System.out.println(tt2.myTest.B);

        System.out.println("==============================");
        int i = 5;
        i = i++ + ++i;
        System.out.println(i);
    }
}
