package practice_9.Synchronized;

/**
 * Created by OmeN on 14.04.2016.
 */

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Класс А прерван");
        }

        System.out.println("Пытается вызвать метод B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Класс Б прерван");
        }

        System.out.println("Пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}
public class DeathBlock implements Runnable {
    A a = new A();
    B b = new B();

    DeathBlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Другой поток");
        t.start();

        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new DeathBlock();
    }
}
