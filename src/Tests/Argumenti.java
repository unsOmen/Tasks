package Tests;

/**
 * Created by OmeN on 18.04.2016.
 */
public class Argumenti {

    static void testArg(int... v) {
        for(int i : v) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] massiv1 = {1, 2, 3, 4, 5};
        testArg(massiv1);

        testArg(6);

        testArg(7,8,9);

        testArg(new Integer(10));
    }
}
