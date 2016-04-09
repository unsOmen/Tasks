package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_1 {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("int i = " + test.i);
        System.out.println("char c = " + test.c);
    }

    public static class Test {
        int i;
        char c;
    }
}
