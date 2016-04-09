package practice_3;

/**
 * Created by OmeN on 22.03.2016.
 */

class Class1 {
    Class1() {
        System.out.println("class1");
    }
}

class Class2 extends Class1 {
    Class2() {
        System.out.println("class2");
    }
}

class Class3 extends Class2 {
    Class3() {
        System.out.println("class3");
    }
}
public class simple_extend {

    public static void main(String[] args) {
        Class3 tt = new Class3();
    }
}
