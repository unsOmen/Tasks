package practice_4;

/**
 * Created by OmeN on 06.04.2016.
 */

 class Class_1 {
    private String msg;
    {
        msg = "";
        msg = msg + "Hello, ";
        msg = msg + "World!";
    }

    String getMsg() {
        return this.msg;
    }
}

class HelloWorld {
    private String msg;{
        this.msg = "Hello, World";
    }

    private Listener change = new Listener() {
        @Override
        public void onChange(HelloWorld helloWorld) {
            helloWorld.msg = "New Hello, World!!";
        }
    };

    void outMsg() {
        System.out.println(this.msg);
    }

    void changeMsg() {
        change.onChange(this);
    }
}
public class test_2 {

    public static void main(String[] args) {
        Class_1 testClass1 = new Class_1();
        System.out.println(testClass1.getMsg());

        HelloWorld tt = new HelloWorld();
        tt.outMsg();

        tt.changeMsg();
        tt.outMsg();
    }
}
