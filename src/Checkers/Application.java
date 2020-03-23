package Checkers;

import Checkers.game.Game;
import Checkers.game.move.Move;
import Checkers.game.move.UserDialogues;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.displayBoard();
//        game.makeMovePawn();
        Move move = UserDialogues.getMove();
        System.out.println(move);
        game.displayBoard();
    }
}
