package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */

class Test_init {
    String str1;
    String str2;
    {
        str1 = "my_def_str_1";
        str2 = "my_def_str_2";
    }

    Test_init() {
        outStr();
    }

    void outStr() {
        System.out.println("def_value_str1 = " + str1);
        System.out.println("def_value_str2 = " + str2);
    }
}
public class task_15 {

    public static void main(String[] args) {
        Test_init tt = new Test_init();

        tt.str1 = "new_value_str1";
        tt.str2 = "new_value_str2";
        tt.outStr();
    }
}
