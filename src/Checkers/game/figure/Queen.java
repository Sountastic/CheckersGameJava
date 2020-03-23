package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.BoardRow;
import Checkers.game.move.Move;
import Checkers.game.move.Position;

public class Queen extends Figure {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValidForFigure(Move move, Board board) {
        return false;
    }

    @Override
    public boolean isMoveWithHitValid(Move move, Board board) {
        return false;
    }

    public boolean isMoveValidForFigure(Move move) {
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();

//        boolean endRowCorrect = start.getRow() + color.direction == end.getRow();
//        boolean columnCorrect = start.getColumn() - == end.getRow() || start.getColumn() + 1 == end.getColumn();

//  dostep do board zeby wyciagnac size() ???   getem jakikolwiek wiersz i jego rozmiar ?

//        return endRowCorrect && columnCorrect;
        return false;
    }

    @Override
    String getFigureSign() {
        return "Q";
    }
}
