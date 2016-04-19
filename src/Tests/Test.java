package Tests;

/**
 * Created by OmeN on 18.04.2016.
 */

class Recursia {
    static int i=1;
    static void tt2(int n) {
        if(i>n) {
            i=0;
            return;
        }
        System.out.println(i++);
        tt2(n);
    }
}

class Factorial {
    int fact(int n) {
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
public class Test {

    static int b() {
        int tt = 20;
        return tt;
    }

    public static void main(String[] args) {

//        for(int i=0; i<10; i++) {
//            if(i%2==0) continue;
//            System.out.println(i);
//        }

        //Recursia asd = new Recursia();
        //asd.tt(100);

        Recursia.tt2(100);

        Factorial ff = new Factorial();
        System.out.println("Факториал числа 3: " + ff.fact(3));
        System.out.println("Факториал числа 5: " + ff.fact(5));
        System.out.println("Факториал числа 8: " + ff.fact(8));
    }
}
