package practice_7.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
public class Task4_Vozobnovlenie_2 {

    static int i = 1;
    static boolean last = false;

    static void f() {
        try {
            if(!last)
                System.out.println(i/0);
        } catch (ArithmeticException e) {
            System.out.println(i++);

            if(i>100) {
                last = true;
            }

            f();
        }
    }

    public static void main(String[] args) {
        f();
    }
}
