package practice_7.My_Exception;

/**
 * Created by OmeN on 11.04.2016.
 */
class SimpleException extends Exception {}
public class Test {

    public void f() throws SimpleException {
        System.out.println("Ошибка SimpleException из метода f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        Test tt = new Test();
        try {
            tt.f();
        } catch (SimpleException e) {
            System.out.println("Исключение SimpleException, перехвачено!");
        }
    }
}
