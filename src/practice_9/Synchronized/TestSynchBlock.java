package practice_9.Synchronized;

/**
 * Created by OmeN on 13.04.2016.
 */

class NewCallme {

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

class NewCaller implements Runnable {

    NewCallme target;
    String msg;
    Thread t;

    public NewCaller(NewCallme target, String msg) {
        this.target = target;
        this.msg = msg;
        this.t = new Thread(this);
        this.t.start();
    }

    @Override
    public void run() {
        synchronized (this.target) {
            this.target.call(msg);
        }
    }
}
public class TestSynchBlock {

    public static void main(String[] args) {
        NewCallme target = new NewCallme();

        NewCaller obj1 = new NewCaller(target, "Добро пожаловать");
        NewCaller obj2 = new NewCaller(target, "в синхронизированный");
        NewCaller obj3 = new NewCaller(target, "мир!");

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
