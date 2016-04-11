package practice_7.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
public class Task1_NullPoint {

    void f() {}

    public static void main(String[] args) {
        Task1_NullPoint tt = null;
        try {
            tt.f();
        } catch (NullPointerException e) {
            System.err.println("Исключение: " + e);
        }
    }
}
