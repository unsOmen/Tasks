package practice_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OmeN on 06.04.2016.
 */

class ChislaFibonachi {
    private List<Integer> chisla;

    public ChislaFibonachi(int count) {
        if(count<2)
            return;

        int[] massiv = new int[count];
        massiv[0] = 1;
        massiv[1] = 1;

        for(int i=2; i<count; i++) {
            massiv[i] = massiv[i-1] + massiv[i-2];
        }
        this.chisla = new ArrayList<Integer>();
        for (Integer i : massiv) {
            this.chisla.add(i);
        }
    }

    void outAll() {
        int index = 0;
        for(Integer i : this.chisla) {
            System.out.println(++index + " " + i);
        }
    }
}
public class test_3 {

    public static void main(String[] args) {
        ChislaFibonachi tt = new ChislaFibonachi(10);
        tt.outAll();

        tt = new ChislaFibonachi(15);
        tt.outAll();
    }
}
