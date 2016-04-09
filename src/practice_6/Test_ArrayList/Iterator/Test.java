package practice_6.Test_ArrayList.Iterator;

import practice_6.Test_ArrayList.Pet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by OmeN on 08.04.2016.
 */

public class Test {

    public static void main(String[] args) {
        List<Pet> pets = Pet.arrayList(10);
        Iterator<Pet> it = pets.iterator();
        System.out.println("====== WHILE =========");
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
        System.out.println("========== FORREACH ==========");
        for(Pet p : pets) {
            System.out.println(p.getName());
        }
        System.out.println("============= FOR ============");
        for(int i=0; i<pets.size(); i++) {
            System.out.println(pets.get(i).getName());
        }
        System.out.println("======= REMOVE 3's elemets =========");
        it = pets.iterator();
        for(int i=0; i<3; i++) {
            it.next();
            it.remove();
        }
        System.out.println("========= RESULT ========");
        for(Pet p : pets) {
            System.out.println(p.getName());
        }
    }
}
