package practice_4;

/**
 * Created by OmeN on 30.03.2016.
 */

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class CheesFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Chess();
    }
}
public class factory {

    static void playGame(GameFactory gameFactory) {
        Game s = gameFactory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new CheesFactory());
    }
}
