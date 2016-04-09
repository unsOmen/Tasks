package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_11 {

    static class AllTheColorsOfTheRainbow {
        int anIntegerColors;

        public AllTheColorsOfTheRainbow(int i) {
            this.anIntegerColors = i;
        }

        void change(int newHue) {
            this.anIntegerColors = newHue;
        }
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow tt = new AllTheColorsOfTheRainbow(123);
        System.out.println("before color: " + tt.anIntegerColors);

        tt.change(321);
        System.out.println("after color: " + tt.anIntegerColors);
    }
}
