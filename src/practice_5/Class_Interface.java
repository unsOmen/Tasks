package practice_5;

/**
 * Created by OmeN on 07.04.2016.
 */
public interface Class_Interface {
    void f();

    class Tester implements Class_Interface {
        private int i = 10;
        public void f() {
            System.out.println(i);
        }

        public static void main(String[] args) {
            new Tester().f();
        }
    }
}
