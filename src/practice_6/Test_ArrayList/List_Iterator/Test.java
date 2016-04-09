package practice_6.Test_ArrayList.List_Iterator;
import practice_6.Test_ArrayList.Pet;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {
    public static void main(String[] args) {
        List<Pet> pets = Pet.arrayList(10);

        ListIterator<Pet> listIterator = pets.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().getName() + ", " + listIterator.nextIndex() + ", " + listIterator.previousIndex() + ";");
            System.out.println();
        }
        System.out.println("================================");
        // В обратном порядке
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getName());
        }
        System.out.println("============= ITERATOR INDEX-4 =================");
        listIterator = pets.listIterator(4);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().getName());
        }
    }
}
