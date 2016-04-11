package practice_8.Tasks;

/**
 * Created by OmeN on 11.04.2016.
 */
interface HasBatteries {}
interface Waterproof {}
interface Shoots{}

class Toy {
    public Toy() {}
    public Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {

    public FancyToy() {
        super(1);
    }
}

public class Test1 {

    static void printInfo(Class c) {
        System.out.println("Имя класса: " + c.getName() + " это интерфейс? [" + c.isInterface() + "]");
        System.out.println("Простое имя: " + c.getSimpleName());
        System.out.println("Каноническое имя: " + c.getCanonicalName());
    }

    public static void main(String[] args) {
        Class cc = null;
        try {
            cc = Class.forName("typeinfo.toys FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс FancyToy");
            System.exit(1);
        }

        printInfo(cc);

        for(Class face : cc.getInterfaces()) {
            printInfo(face);
        }

        Class up = cc.getSuperclass();
        Object object = null;

        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать объект");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа");
            System.exit(1);
        }

        printInfo(object.getClass());
    }
}
