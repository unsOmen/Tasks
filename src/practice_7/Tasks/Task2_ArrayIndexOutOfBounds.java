package practice_7.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
public class Task2_ArrayIndexOutOfBounds {

    public static void main(String[] args) {
        int[] massiv = new int[] { 1,2,3,4,5};
        try {
            System.out.println(massiv[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Исключение: " + e);
        }
    }
}
