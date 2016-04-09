package practice_3;

/**
 * Created by OmeN on 22.03.2016.
 */

class Game {
    Game(int i) {
        System.out.println("Class Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("Class BoardGame");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Class Chess");
    }
}
public class simple_extends_argument {

    public static void main(String[] args) {
        Chess tt = new Chess();
    }
}
