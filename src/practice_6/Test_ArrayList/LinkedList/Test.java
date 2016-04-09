package practice_6.Test_ArrayList.LinkedList;

import practice_6.Test_ArrayList.Pet;

import java.util.LinkedList;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pet.arrayList(10));
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("===================================");
        //идентичные методы
        System.out.println(".getFirst(): " + pets.getFirst().getName());
        System.out.println(".elemet(): " + pets.element().getName());

        // отличается поведения для пустого списка
        System.out.println(".peek(): " + pets.peek().getName());

        // идентично узащение и возвращение первого элемента
        System.out.println(".remove(): " + pets.remove().getName());
        System.out.println(".removeFirst():" + pets.removeFirst().getName());

        // отличается только поведение для пустого списка
        System.out.println(".pull(): " + pets.poll().getName());
        for(Pet p : pets)
            System.out.println(p.getName());

        pets.addFirst(new Pet("new_Pet"));
        System.out.println("После .addFirst: ");
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("---------------------------------------");

        pets.offer(new Pet("rnd_Pet"));
        System.out.println("После .offer: ");
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("---------------------------------------");

        pets.add(new Pet("add_Pet"));
        System.out.println("После .add: ");
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("---------------------------------------");

        pets.addLast(new Pet("addLast_Pet"));
        System.out.println("После .addLast: ");
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("---------------------------------------");

        pets.removeLast();
        System.out.println("После .removeLast: ");
        for(Pet p : pets)
            System.out.println(p.getName());
        System.out.println("---------------------------------------");
        System.out.println(pets.toString());
    }
}
