package practice_8.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
interface A {
    void f();
}

class B implements A {
    public void f() {}
    public void g() {}
}

public class Test2 {

    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g();// ОШИБКА!
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
}
