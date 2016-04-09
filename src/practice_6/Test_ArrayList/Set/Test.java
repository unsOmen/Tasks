package practice_6.Test_ArrayList.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {

    public static void main(String[] args) {
        Random rnd = new Random(47);
        Set<Integer> set1 = new HashSet<Integer>();
        for(int i=0; i<10000; i++) {
            set1.add(rnd.nextInt(30));
        }

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<Integer>();
        for(int i=0; i<10000; i++) {
            set2.add(rnd.nextInt(30));
        }

        System.out.println(set2);
    }
}
