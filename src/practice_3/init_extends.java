package practice_3;

/**
 * Created by OmeN on 22.03.2016.
 */
class Insect {
    private int i=9;
    protected int j;
    Insect() {
        System.out.println("i =" + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("Поле static Insect.x1 инициализировано");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class init_extends extends Insect {
    private int k = printInit("Поле init_extends.k инициализировано");
    public init_extends() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Поле static Beetle.x2 инициализировано");

    public static void main(String[] args) {
        System.out.println("Конструктор init_extends");
        init_extends tt = new init_extends();
    }
}
