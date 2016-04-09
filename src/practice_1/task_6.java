package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_6 {

    public static void main(String[] args) {
        String s = "wtf?";
        System.out.println(storage(s));
    }

    static int storage(String s) {
        return s.length() * 2;
    }
}
