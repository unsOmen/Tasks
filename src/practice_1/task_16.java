package practice_1;

import java.util.Random;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_16 {

    static int[] rand = new int[25];

    public static void main(String[] args) {
        for(int i=0; i<25; i++) {
            rand[i] = getRand();
            System.out.println(i + " : " + rand[i]);
        }

        for(int i=0; i<25; i++) {
            check(i);
        }
    }

    static int getRand() {
        return new Random().nextInt(10);
    }

    static void check(int index) {
        for(int i=0; i<25; i++) {
            if(i!=index) {
                if(rand[index]>rand[i])
                    System.out.println(i + ". Chislo: " + rand[index]+ "["+ index +"]" + " > " + rand[i]+ "["+ i +"]");
                else if(rand[index]<rand[i])
                    System.out.println(i + ". Chislo: " + rand[index]+ "["+ index +"]" + " < " + rand[i]+ "["+ i +"]");
                else if(rand[index]==rand[i])
                    System.out.println(i + ". Chislo: " + rand[index]+ "["+ index +"]" + " = " + rand[i]+ "["+ i +"]");
            } else
                System.out.println("i = " + i);
        }
        System.out.println("==========================================================");
    }
}
