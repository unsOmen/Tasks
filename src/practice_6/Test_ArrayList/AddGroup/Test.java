package practice_6.Test_ArrayList.AddGroup;

import java.util.*;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11,12,13,14,15); // работает быстрей
        Collections.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1, 99);

        for(Integer i : collection) {
            System.out.println(i);
        }
        System.out.println("====================================");

        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
