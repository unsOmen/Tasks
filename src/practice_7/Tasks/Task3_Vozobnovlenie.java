package practice_7.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
public class Task3_Vozobnovlenie {

    static boolean tt = true;
    public static void main(String[] args) {
        int i=1;
        while (tt) {
            try {
                if(i<=100)
                    System.out.println(i/0);
            } catch (ArithmeticException e) {
                System.out.println(i++);
            }
        }
    }
}
