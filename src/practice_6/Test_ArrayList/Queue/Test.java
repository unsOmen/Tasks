package practice_6.Test_ArrayList.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {

    public static void printQ(Queue q) {
        while (q.peek()!=null) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random(47);
        for(int i=0; i<10; i++) {
            queue.offer(random.nextInt(i+10));
        }
        printQ(queue);

        Queue<Character> q2 = new LinkedList<Character>();
        for(char c : "Nogizaka46".toCharArray()) {
            q2.offer(c);
        }
        printQ(q2);
    }
}
