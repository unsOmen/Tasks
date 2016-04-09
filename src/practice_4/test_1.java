package practice_4;

/**
 * Created by OmeN on 30.03.2016.
 */

interface int1 {
    void method1_1();
    void method1_2();
}

interface int2 {
    void method2_1();
    void method2_2();
}

interface int3 {
    void method3_1();
    void method3_2();
}

interface int4 extends int1, int2, int3 {

    void method4_1();
    void method4_2();
}

class class1 {
    void method() {System.out.println("class1.method()");};
    void print(String s) { System.out.println(s);}
}

class class2 extends class1 implements int4 {

    @Override
    public void method4_1() {
        print(this + "method4_1");
    }

    @Override
    public void method4_2() {
        print(this + "method4_2");
    }

    @Override
    public void method1_1() {
        print(this + "method1_1");
    }

    @Override
    public void method1_2() {
        print(this + "method1_2");
    }

    @Override
    public void method2_1() {
        print(this + "method2_1");
    }

    @Override
    public void method2_2() {
        print(this + "method2_2");
    }

    @Override
    public void method3_1() {
        print(this + "method3_1");
    }

    @Override
    public void method3_2() {
        print(this + "method3_2");
    }
}
public class test_1 {

    static void methods_int1(int1 i) {
        i.method1_1();
        i.method1_2();
    }

    static void methods_int2(int2 i) {
        i.method2_1();
        i.method2_2();
    }

    static void methods_int3(int3 i) {
        i.method3_1();
        i.method3_2();
    }

    static void methods_int4(int4 i) {
        i.method1_1();
        i.method1_2();
        i.method2_1();
        i.method2_2();
        i.method3_1();
        i.method3_2();
        i.method4_1();
        i.method4_2();
    }

    public static void main(String[] args) {
        class2 tt = new class2();
        tt.method();
        methods_int1(tt);
        methods_int2(tt);
        methods_int3(tt);
        methods_int4(tt);
    }
}
