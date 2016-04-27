package Reflection;

import java.lang.reflect.*;

/**
 * Created by OmeN on 27.04.2016.
 */
interface iA {

}

interface iB {

}

interface iC {

}
class MyTestClass implements iA, iB {
    public int i;
    public String msg;

    private int y;

    public MyTestClass() {
        this.i = 0;
        this.msg = "Test";
        this.y = 0;
    }

    public MyTestClass(int i, String msg) {
        this.i = i;
        this.msg = msg;
        this.y = 10;
    }

    public MyTestClass(int i, String msg, int y) {
        this.i = i;
        this.msg = msg;
        this.y = y;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void callMsg() {
        for(int i=0; i<y; i++)
            System.out.println(msg);
    }

    public int getY() {
        return y;
    }
}

class MyTestClass2 extends MyTestClass implements iC {
    private String z;
    public MyTestClass2(int i, String msg) {
        super(i, msg);
    }
}
public class Test {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        MyTestClass a = new MyTestClass(5, "test_msg");
        MyTestClass2 b = new MyTestClass2(10, "test_msg_2");

        // Получение объекта типа Class
        Class aClass = a.getClass();
        Class bClass = b.getClass();
        System.out.println("Получение объекта типа Class: " + aClass);
        System.out.println("Получение объекта типа Class: " + bClass);
        sendEndSimble(0);

        // Получение имени класса
        String aName = aClass.getName();
        String bName = bClass.getName();
        System.out.println("Получение имени класса: " + aName);
        System.out.println("Получение имени класса: " + bName);
        sendEndSimble(0);

        // Исследование модификаторов класса
        int mods = Integer.class.getClass().getModifiers();
        System.out.print("Модификатор: ");
        if(Modifier.isPublic(mods))
            System.out.println("public");
        if(Modifier.isPrivate(mods))
            System.out.println("private");
        sendEndSimble(0);

        // Нахождение суперклассов
        Class superclass = b.getClass().getSuperclass();
        System.out.println("Нахождение суперклассов: \n" + "\tClass: " + b.getClass() + "\n" + "\tSuperclass: " + superclass);
        sendEndSimble(0);

        // Определение интерфейсов, реализуемых классом
        Class[] interface_a = aClass.getInterfaces();
        Class[] interface_b = bClass.getInterfaces();
        System.out.println("Интерфейсы класса А: ");
        for(Class inter : interface_a)
            System.out.println("\t" + inter);

        System.out.println("Интерфейсы класса B: ");
        for (Class inter : interface_b)
            System.out.println("\t" + inter);
        sendEndSimble(0);

        // Исследование, получение и установка значений полей класса.
        // getFields() - для public полей
        Field[] aClassFields = aClass.getFields();
        Field[] bClassFields = bClass.getFields();
        System.out.println("Поля public класса А: ");
        for (Field f : aClassFields)
            System.out.println("\tИмя: " + f.getName() + ";\tТип: " + f.getType().getName());

        System.out.println("Поля public класса B: ");
        for (Field f : bClassFields)
            System.out.println("\tИмя: " + f.getName() + ";\tТип: " + f.getType().getName());
        sendEndSimble(1);

        // getDeclaredFields() - все поля
        aClassFields = aClass.getDeclaredFields();
        bClassFields = bClass.getDeclaredFields();
        System.out.println("Все поля класса А: ");
        for (Field f : aClassFields)
            System.out.println("\tИмя: " + f.getName() + ";\tТип: " + f.getType().getName());

        System.out.println("Все поля класса B: ");
        for (Field f : bClassFields)
            System.out.println("\tИмя: " + f.getName() + ";\tТип: " + f.getType().getName());
        sendEndSimble(0);

        // Изменяем значение полей
        Field field = aClass.getField("msg");
        String msg = (String) field.get(a);
        System.out.println("Изменяем значение полей public:");
        System.out.println("\tБыло: " + msg);

        field.set(a, "new_msg");
        System.out.println("\tСтало: " + a.getMsg());
        sendEndSimble(1);

        System.out.println("Изменяем значение полей private: ");
        System.out.println("\tБыло: " + a.getY());
        Field privateFiled = aClass.getDeclaredField("y");
        privateFiled.setAccessible(true);
        privateFiled.setInt(a, 13);
        System.out.println("\tСтало: " + a.getY());
        sendEndSimble(0);

        // Исследование конструкторов класса
        sendContstructors(aClass);
        sendEndSimble(1);
        sendContstructors(bClass);
        sendEndSimble(0);

        // Исследование информации о методе, вызов метода
        sendMethods(a);
        sendEndSimble(1);
        sendMethods(b);
        sendEndSimble(0);

        // Вызов метода по имени
        System.out.println("До вызова метода А.setMsg: " + a.getMsg());
        Class[] paramType = new Class[] {String.class};
        Method m = aClass.getMethod("setMsg", paramType);
        Object[] argss = new Object[] { new String("new_msg_use_reflect_method")};
        m.invoke(a, argss);
        System.out.println("После вызова метода A.setMsg через reflection: " + a.getMsg());
        sendEndSimble(0);

        // Загрузка и динамическое создание экземпляра класса
        Class c = Class.forName("Reflection.MyTestClass");
        Object obj = c.newInstance();
        MyTestClass test = (MyTestClass) obj;
        System.out.println("Класс: " + test.getClass().getName() + "; msg = " + test.getMsg());
        sendEndSimble(0);
    }

    static void sendMethods(Object obj) { // getMethods() - для открытых методов, getDeclaredMethods() - для закрытых методов
        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        System.out.println("Методы класса " + c.getName() + ": ");
        for (Method method : methods) {
            System.out.print("\tИмя: " + method.getName() + "; ");

            Class[] paramType = method.getParameterTypes();
            if(paramType.length>0) {
                System.out.print("Типы параметров: ");
                for(Class param : paramType)
                    System.out.print(param.getName() + "; ");
            }
            System.out.println("\tВозвращаемый тип: " + method.getReturnType().getName());
        }
    }

    static void sendContstructors(Class target) {
        Constructor[] constructors = target.getConstructors();
        System.out.println("Коснтрукторы класс " + target.getName());
        for (Constructor c : constructors) {
            Class[] param = c.getParameterTypes();
            System.out.print("\t" + c.getName() + "; param: ");
            for(Class paramType : param)
                System.out.print(paramType.getName() + "; ");

            System.out.println("");
        }
    }

    static void sendEndSimble(int i) {
        if(i>0)
            System.out.println("--------------------------------");
        else
            System.out.println("==================================");
    }
}
