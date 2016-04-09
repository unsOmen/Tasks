package practice_6.Test_ArrayList.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {

    public static void main(String[] args) {
        Random rnd = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0; i<10000; i++) {
            int r = rnd.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq+1);
        }

        System.out.println(m);
    }
}
