package practice_6.Test_ArrayList;

import java.util.ArrayList;

/**
 * Created by OmeN on 08.04.2016.
 */
public class Pet {
    private static int indexName;
    private String name;

    public Pet(String name) {
        this.name = name + "_" + indexName;
        indexName++;
    }
    public static ArrayList<Pet> arrayList(int count) {
        ArrayList<Pet> list = new ArrayList<Pet>();
        for(int i=0; i<count; i++) {
            list.add(new Pet("Pet_Name"));
        }

        return list;
    }

    public String getName(){
        return this.name;
    }
}
