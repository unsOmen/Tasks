package practice_1;

/**
 * Created by OmeN on 20.03.2016.
 */
public class task_21 {

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            if(i==99)
                return;
            if((i-1)%10==0 && (i-1)>0)
                System.out.println();
            System.out.print(i + " ");
        }
    }
}
