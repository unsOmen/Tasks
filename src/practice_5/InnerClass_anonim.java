package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */
class Context {
    private int value;
    private String msg;
}
class Anonim {
    public Context cont() {
        return new Context() {
            private int i = 4;
            private String msg = "msg2";
            public int getValue() { return i;}
            public String getMsg() { return msg;}
        };
    }
}
public class InnerClass_anonim {

    public static void main(String[] args) {
        Anonim t1 = new Anonim();
        Context t2 = t1.cont();
    }
}
