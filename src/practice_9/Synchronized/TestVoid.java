package practice_9.Synchronized;

/**
 * Created by OmeN on 13.04.2016.
 */
class Call_me {
    synchronized void call(String str) {
        System.out.print("[" + str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }

        System.out.println("]");
    }
}

class Caller implements Runnable {

    Call_me target;
    String msg;
    Thread t;

    public Caller(Call_me target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
public class TestVoid {

    public static void main(String[] args) {
        Call_me target = new Call_me();

        Caller obj1 = new Caller(target, "Добро пожаловать");
        Caller obj2 = new Caller(target, "в синхронизированный");
        Caller obj3 = new Caller(target, "мир!");

        // ожидаем завершение потока исполнения
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
