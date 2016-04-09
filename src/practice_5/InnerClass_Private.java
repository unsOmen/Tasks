package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */
interface intString {
    String getStringValue();
}

interface intInteger {
    int getIntegerValue();
}

class TestClass {

    private class TestIntString implements intString {
        private String msg = "Hello, World!!";

        @Override
        public String getStringValue() {
            return msg;
        }
    }

    protected class TestIntInteger implements intInteger {
        private int value = 14;

        @Override
        public int getIntegerValue() {
            return value;
        }
    }

    public intString interfaceString() {
        return new TestIntString();
    }

    public intInteger interfaceInteger() {
        return new TestIntInteger();
    }
}
public class InnerClass_Private {

    public static void main(String[] args) {
        TestClass tt = new TestClass();
        intString t1 = tt.interfaceString();
        intInteger t2 = tt.interfaceInteger();

        System.out.println(t1.getStringValue());
        System.out.println(t2.getIntegerValue());

        //intString t3 = tt.new TestIntString(); !!! ОШИБКА !!! потому что PRIVATE CLASS
        intInteger t4 = tt.new TestIntInteger();

        System.out.println(t4.getIntegerValue());
    }
}
