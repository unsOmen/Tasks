package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
class Test_static {
    static String str1;
    static String str2;

    static {
        str1 = "STR1!!";
        str2 = "STR2!!";
    }

    Test_static() {
        System.out.println("Static str1 = " + str1);
        System.out.println("Static str2 = " + str2);
    }
}
public class task_14 {

    public static void main(String[] args) {
        Test_static tt = new Test_static();
    }
}
