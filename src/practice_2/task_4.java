package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_4 {

    static class Test_constr {
        Test_constr() {
            System.out.println("new Test constr");
        }

        Test_constr(String s) {
            System.out.println("new Test constr - " + s);
        }
    }

    public static void main(String[] args) {
        Test_constr tt = new Test_constr();
        Test_constr tt2 = new Test_constr("T_T");
    }
}
