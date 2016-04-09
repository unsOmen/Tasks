package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_8 {

    static class StaticTest {
        private static int cout_obj;

        public StaticTest() {
            cout_obj++;
        }

        static int getCout_obj() {
            return cout_obj;
        }
    }

    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        System.out.println("count = " + StaticTest.getCout_obj());

        StaticTest t2 = new StaticTest();
        System.out.println("count = " + StaticTest.getCout_obj());

        StaticTest t3 = new StaticTest();
        System.out.println("count = " + StaticTest.getCout_obj());
    }
}
