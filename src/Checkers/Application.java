package Checkers;

import Checkers.game.Game;
import Checkers.game.figure.Figure;
import Checkers.game.figure.Pawn;
import Checkers.game.move.UserDialogues;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.displayBoard();
        game.doMove(UserDialogues.getMove());
        game.displayBoard();
//        game.getBoard().setFigure(UserDialogues.getMove().getStartPosition().getRow(), UserDialogues.getMove().getStartPosition().getColumn(), new Pawn(Figure.Color.BLACK));
//        game.displayBoard();
    }
}
