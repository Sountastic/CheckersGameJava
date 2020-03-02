package Checkers;

import Checkers.game.Game;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.displayBoard();

    }
}
