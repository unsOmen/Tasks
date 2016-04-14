package practice_9.Thread;

/**
 * Created by OmeN on 13.04.2016.
 */
import practice_9.Thread.TestThread;
public class MultiThread_JOIN {

    public static void main(String[] args) {
        TestThread t1 = new TestThread("Первый", 750);
        TestThread t2 = new TestThread("Второй", 550);
        TestThread t3 = new TestThread("Третий", 400);

        System.out.println("Поток: " + t1 + " запущен! " + t1.t.isAlive());
        System.out.println("Поток: " + t2 + " запущен! " + t2.t.isAlive());
        System.out.println("Поток: " + t3 + " запущен! " + t3.t.isAlive());

        // ожидаем завершения потоков
        try {
            System.out.println("Ожидание завершения потоков");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток: " + t1 + " запущен! " + t1.t.isAlive());
        System.out.println("Поток: " + t2 + " запущен! " + t2.t.isAlive());
        System.out.println("Поток: " + t3 + " запущен! " + t3.t.isAlive());

        System.out.println("Главный поток завершен");
    }
}
