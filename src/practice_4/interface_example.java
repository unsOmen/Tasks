package practice_4;

/**
 * Created by OmeN on 30.03.2016.
 */
interface Instrument {
    int VALUE = 5; // является static и final
    void play();
    void abjust();
}

class Wind implements Instrument {

    @Override
    public void play() {
        System.out.println(this + ".play()");
    }

    @Override
    public void abjust() {
        System.out.println(this + ".abjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {

    @Override
    public void play() {
        System.out.println(this + ".play()");
    }

    @Override
    public void abjust() {
        System.out.println(this + ".abjust()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Brass extends Wind {

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {

    @Override
    public String toString() {
        return "Woodwind";
    }
}
public class interface_example {

    static void tuneAll(Instrument[] instruments) {
        for(Instrument i : instruments) {
            tune(i);
        }
    }

    static void tune(Instrument i) {
        i.play();
    }

    public static void main(String[] args) {
        Instrument[] tt = { new Brass(), new Woodwind(), new Percussion()};
        tuneAll(tt);
        System.out.println(Instrument.VALUE);
    }
}
