package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_10 {

    static class Test_finalize {
        boolean wtf = false;
        Test_finalize(boolean t) {
            wtf = t;
        }

        public void out() {
            wtf = false;
            System.out.println("void out: " + this);
        }
        public void finalize() {
            if(wtf)
                System.out.println("void finalize: " + this);
        }
    }

    public static void main(String[] args) {
        Test_finalize tt = new Test_finalize(true);
        tt.out();

        new Test_finalize(true);
        System.gc();
    }
}
