package practice_5;

/**
 * Created by OmeN on 07.04.2016.
 */

class TestWithInner {
    class TestInner {
        void f() {
            System.out.println("T_T");
        }
    }
}

public class Inner_Extend_class extends TestWithInner.TestInner {

    Inner_Extend_class(TestWithInner w) {
        w.super();
    }

    public static void main(String[] args) {
        TestWithInner twi = new TestWithInner();
        Inner_Extend_class iec = new Inner_Extend_class(twi);
        iec.f();
    }
}
