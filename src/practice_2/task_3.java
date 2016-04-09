package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_3 {

    static class Test_constr {
        Test_constr() {
            System.out.println("new Test constr");
        }
    }

    public static void main(String[] args) {
        Test_constr tt = new Test_constr();
    }
}
