package practice_5;

/**
 * Created by OmeN on 07.04.2016.
 */

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1() {}
    public void method1() {System.out.println("Implementation_1 method1()");}
    public void method2() { System.out.println("Implementation_1 method2()");}

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    private Implementation2() {}
    public void method1() { System.out.println("Implementation_2 method1()");}
    public void method2() { System.out.println("Implementation_2 method2()");}

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }
}

public class factory_method {

    public static void main(String[] args) {
        Factories.serviceConsumer(Implementation1.factory);
        Factories.serviceConsumer(Implementation2.factory);
    }
}
