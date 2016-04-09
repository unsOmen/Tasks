package practice_1;

/**
 * Created by OmeN on 20.03.2016.
 */
public class task_23 {

    public static void main(String[] args) {
        fibonacci(7);
    }

    static void fibonacci(int count) {
        if(count<2) {
            System.out.println("Vvedite chislo >= 3 !!!");
            return;
        }
        int[] massiv = new int[count+1];
        massiv[0] = 0;
        massiv[1] = 1;
        for(int x=2; x<=count; x++) {
            massiv[x] = massiv[x-1] + massiv[x-2];
        }

        for(int i : massiv) {
            if(i>0) {
                System.out.print(i);
                if(i!=massiv[count])
                    System.out.print(", ");
            }
        }
    }
}
