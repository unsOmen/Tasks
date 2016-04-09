package practice_1;

/**
 * Created by OmeN on 20.03.2016.
 */
public class task_20 {

    public static void main(String[] args) {
        System.out.println(test(1, 10, 11));
    }

    static int test(int begin, int end, int testvalue) {
        if(testvalue >= begin && testvalue <= end) {
            return 1;
        } else {
            return 0;
        }
    }
}
