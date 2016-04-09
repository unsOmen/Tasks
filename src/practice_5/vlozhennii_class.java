package practice_5;

/**
 * Created by OmeN on 07.04.2016.
 */
interface Vlozh {
    int value();
}
class TestVlozhClass {

    private static class VlozhClass implements Vlozh {
        private int i = 11;
        public int value() {
            return i;
        }

        private static class VlozhClass_2 implements Vlozh {
            private int i = 13;
            public int value() {
                return i;
            }
        }
    }

    public static VlozhClass getVlozhClass() {
        return new VlozhClass();
    }

    public static VlozhClass.VlozhClass_2 getVlozhClass_2() {
        return new VlozhClass.VlozhClass_2();
    }
}
public class vlozhennii_class {

    public static void main(String[] args) {
        Vlozh tt = TestVlozhClass.getVlozhClass();
        Vlozh tt2 = TestVlozhClass.getVlozhClass_2();
        System.out.println(tt.value());
        System.out.println(tt2.value());
    }
}
