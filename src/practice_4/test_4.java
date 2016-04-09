package practice_4;

/**
 * Created by OmeN on 06.04.2016.
 */

class SensCalc {
    public static void Calc(float oldDPI, float oldSens, float newDPI) {
        float old = oldSens * oldDPI;
        float newSens = old / newDPI;
        System.out.println(newSens);
    }
}

public class test_4 {

    public static void main(String[] args) {
        SensCalc.Calc(1800, 0.75f, 400);
    }
}
