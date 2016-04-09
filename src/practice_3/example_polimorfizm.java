package practice_3;

/**
 * Created by OmeN on 28.03.2016.
 */
class Cycle {

}

class Unicycle extends Cycle {

}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}
public class example_polimorfizm {

    static void ride(Cycle i) {
        System.out.print(i.hashCode());
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        ride(b);
    }
}
