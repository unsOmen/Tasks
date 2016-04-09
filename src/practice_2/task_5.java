package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_5 {

    static class Dog {
        Dog() {
            System.out.println("Vav!");
        }

        Dog(int count) {
            for(int i=0; i<count; i++) {
                System.out.print("Vav! ");
            }
            System.out.println("");
        }

        Dog(String s) {
            System.out.println("Dog say: " + s);
        }

        Dog(String s, int count) {
            System.out.println("Dog say: " + s);
            for(int i=0; i<count; i++)
                System.out.println("Vav! ");
        }

        Dog(int count, String s) {
            for(int i=0; i<count; i++) {
                System.out.print("Vav! ");
            }
            System.out.println("Dog say: " + s);
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(3);
        Dog dog3 = new Dog("RRrrrrrr");
        Dog dog4 = new Dog("GG!", 4);
        Dog dog5 = new Dog(2, "HF");

    }
}
