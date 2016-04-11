package practice_7.My_Exception;

/**
 * Created by OmeN on 11.04.2016.
 */

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) { super(msg);}
}


public class Test2 {

    public static void f() throws MyException {
        System.err.println("Возбуждаем MyException из f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.err.println("Возбуждаем MyException из g()");
        throw new MyException("Создано в g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        } finally {
            System.err.println("Завершение после ошибки finally()");
        }
    }
}
