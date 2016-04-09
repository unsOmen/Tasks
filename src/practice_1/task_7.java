package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_7 {

    static class Incremetable {
        static int i = 2;

        static void increment() {
            i++;
        }

        int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        Incremetable tt = new Incremetable();
        System.out.println("before i: " + tt.getI());

        Incremetable.increment();
        System.out.println("after i: " + tt.getI());
    }
}
