package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_18 {

    public static void main(String[] args) {
        for(int i=2; i<=25; i++) {
            int del = 0;
            for(int j=2; j<i; j++) {
                if(i%j==0)
                    del++;
            }

            if(del==0)
                System.out.println(i);
        }
    }
}
