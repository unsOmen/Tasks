package practice_6.Test_ArrayList;

import java.util.ArrayList;

/**
 * Created by OmeN on 08.04.2016.
 */

class Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Apple> arrayList = new ArrayList<Apple>();
        arrayList.add(new Gala());
        arrayList.add(new Fuji());
        arrayList.add(new Apple());

        for(Apple i : arrayList) {
            System.out.println(i);
        }
    }
}
