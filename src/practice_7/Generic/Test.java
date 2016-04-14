package practice_7.Generic;

/**
 * Created by OmeN on 13.04.2016.
 */
class Gen<T> {

    T ob; // объявление типа Т

    public Gen(T obj) { // передача конструктору ссылку на объект Т
        this.ob = obj;
    }

    T getOb() { // вернуть объект T
        return this.ob;
    }

    void showType() {
        System.out.println("Тип Т: " + ob.getClass().getName());
    }

    @Override
    public String toString() {
        return "Gen{" +
                "ob=" + ob +
                '}' + " "+ob.getClass().getName();
    }
}

public class Test {

    public static void main(String[] args) {
        Gen<Integer> test_generic = new Gen<Integer>(322);
        System.out.println(test_generic.getOb());
        test_generic.showType();

        Gen<String> test_generic2 = new Gen<String>("322");
        System.out.println(test_generic2.getOb());
        test_generic2.showType();

        System.out.println(test_generic);
        System.out.println(test_generic2);
    }
}
