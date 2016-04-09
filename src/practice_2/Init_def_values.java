package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class Init_def_values {

    boolean b;
    char c;
    byte t;
    short s;
    int i;
    float f;
    double d;
    Init_def_values tt;

    void printInitValues() {
        System.out.println("Tip dannih               Zna4enie");
        System.out.println("___________________________________");
        System.out.println("boolean                   " + b);
        System.out.println("char                      " + c);
        System.out.println("byte                      " + t);
        System.out.println("short                     " + s);
        System.out.println("int                       " + i);
        System.out.println("float                     " + f);
        System.out.println("double                    " + d);
        System.out.println("init_def_values.class     " + tt);
    }

    public static void main(String[] args) {
        Init_def_values wtf = new Init_def_values();
        wtf.printInitValues();
    }
}
