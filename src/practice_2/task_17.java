package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */

class Test_massiv_constr {
    Test_massiv_constr(String s) {
        System.out.println(s);
    }
}
public class task_17 {

    public static void main(String[] args) {
        Test_massiv_constr[] tt = new Test_massiv_constr[10];
        for(int i=0; i<tt.length; i++) {
            tt[i] = new Test_massiv_constr("str_" + i);
        }
    }
}
