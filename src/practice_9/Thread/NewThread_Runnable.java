package practice_9.Thread;

/**
 * Created by OmeN on 13.04.2016.
 */

class NewThread implements Runnable {

    Thread t;

    public NewThread() {
        // создаем новый поток исполнения
        this.t = new Thread(this, "Тестовый поток");
        System.out.println("Дочерний поток создан: " + this.t);
        t.start(); // запускаем поток исполнения
    }

    @Override
    public void run() { // точка входа во второй поток
        try {
            for(int i=5; i>0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }

        System.out.println("Дочерний поток завершен");
    }
}
public class NewThread_Runnable {

    public static void main(String[] args) {
        new NewThread2();

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}
