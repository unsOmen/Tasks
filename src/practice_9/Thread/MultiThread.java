package practice_9.Thread;

import practice_7.CompareTo.Test;

/**
 * Created by OmeN on 13.04.2016.
 */
class TestThread implements Runnable {

    String name;
    Thread t;
    int del;

    public TestThread(String s, int del) {
        this.name = s;
        this.del = del;
        this.t = new Thread(this, this.name);
        System.out.println("Дочерний поток: " + this.t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=5; i>0; i--) {
                System.out.println(this.name + " " + this.t + " = " + i);
                Thread.sleep(del);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name + " " + this.t + " прерван");
        }

        System.out.println(this.name + " " + this.t + " завершен");
    }

    @Override
    public String toString() {
        return "TestThread{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class MultiThread {

    public static void main(String[] args) {
        TestThread t1 = new TestThread("Первый", 400);
        TestThread t2 = new TestThread("Второй", 450);
        TestThread t3 = new TestThread("Третий", 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}
