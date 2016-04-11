package practice_7.My_Exception;

/**
 * Created by OmeN on 11.04.2016.
 */

class MyException2 extends Exception {

    private static int count;
    public MyException2() {}
    public MyException2(String msg) { super(msg);}
    public MyException2(String msg, int x) {
        super(msg);
        this.count = x;
    }

    public int val() {
        return this.count;
    }

    public String getMessage() {
        return "Подробное сообщение: " + count + " " + super.getMessage();
    }
}
public class Test3 {
    static void f() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из f()");
        throw new MyException2();
    }

    static void g() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из g()");
        throw new MyException2("Создано в g()");
    }

    static void h() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из h()");
        throw new MyException2("Создано в h()", 47);
    }

    static void j() throws MyException2 {
        System.out.println("Возбуждаем MyException2 из j()");
        throw new MyException2("tt");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }

        try {
            j();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
    }
}
