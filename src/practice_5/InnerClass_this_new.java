package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */

class Test1 {
    private String msg = "Msg_Test1";

    class Test2 {
        Test1 getParent() {
            return Test1.this;
        }

        Test2 getObj() {
            return this;
        }
    }

    Test2 test2() {
        return new Test2();
    }

    Test1 getObj() {
        return this;
    }
}
public class InnerClass_this_new {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1.Test2 t2 = t1.test2();
        Test1.Test2 t3 = new Test1().test2();
        Test1.Test2 t4 = t1.new Test2();

        System.out.println(t1.getObj());
        System.out.println(t2.getParent() + " - " + t2.getObj());
        System.out.println(t3.getParent() + " - " + t3.getObj());
        System.out.println(t4.getParent() + " - " + t4.getObj());


    }
}
