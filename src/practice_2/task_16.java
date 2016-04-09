package practice_2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_16 {

    public static void main(String[] args) {
        Random random = new Random(47);
        String[] str = new String[random.nextInt(20)];
        for(int i=0; i<str.length; i++) {
            str[i] = "str_"+i;
            System.out.println("str["+i+"] = " + str[i]);
        }
    }
}
