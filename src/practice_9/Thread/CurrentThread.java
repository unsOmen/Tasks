package practice_9.Thread;

/**
 * Created by OmeN on 13.04.2016.
 */
public class CurrentThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток: " + t);

        // изменим имя потока
        t.setName("Новое имя потока");
        System.out.println("Имя потока после изменения: " + t);
        try {
            for(int n=5; n>0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
