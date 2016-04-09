package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */
interface TestInterface {
    String getMsg();
}

class TestInnerClass {
    public TestInterface getInterface(String s) {
        class PTestInterface implements TestInterface {
            private String msg;
            private PTestInterface(String msg) {
                this.msg = msg;
            }

            public String getMsg() {
                return msg;
            }
        }

        return new PTestInterface(s);
    }
}
public class InnerClass_local_innerclass {

    public static void main(String[] args) {
        TestInnerClass tt = new TestInnerClass();
        TestInterface tt2 = tt.getInterface("Oo!!");
        System.out.println(tt2.getMsg());
    }
}
