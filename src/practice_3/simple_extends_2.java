package practice_3;

/**
 * Created by OmeN on 22.03.2016.
 */

class ClassA {
    ClassA() {
        System.out.println("Class A");
    }
}

class ClassB extends ClassA {
    ClassB() {
        System.out.println("Class B");
    }
}

class ClassC extends ClassB {

}
public class simple_extends_2 {
    public static void main(String[] args) {
        ClassC tt = new ClassC();
    }
}
