package practice_9.Synchronized;

/**
 * Created by OmeN on 14.04.2016.
 */

class NewThread implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        this.name = threadName;
        this.t = new Thread(this, this.name);
        System.out.println("Новый поток: " + this.t);
        suspendFlag = false;
        this.t.start(); // запуск потока
    }

    @Override
    public void run() {
        try {
            for(int i=15; i>0; i--) {
                System.out.println(name+ " : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag)
                        wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + name + " прерван");
        }

        System.out.println("Поток " + name + " завершен");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
public class Suspend_Resume {

    public static void main(String[] args) {
        NewThread t1 = new NewThread("Один");
        NewThread t2 = new NewThread("Два");

        try {
            Thread.sleep(1000);
            t1.mysuspend();
            System.out.println("Приостановка потока: " + t1.name);
            Thread.sleep(1000);
            t1.myresume();
            System.out.println("Возобновление потока: " + t1.name);
            t2.mysuspend();
            System.out.println("Приостановка потока: " + t2.name);
            Thread.sleep(1000);
            t2.myresume();
            System.out.println("Возобновление потока: " + t2.name);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидаем завершение потоков");
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
