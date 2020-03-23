package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.move.Move;
import Checkers.game.move.Position;

public class Queen extends Figure {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValidForFigure(Move move, Board board) {
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();

        boolean endRowCorrect = start.getRow() + color.direction == end.getRow();
        boolean columnCorrect = start.getColumn() == end.getRow() || start.getColumn() + 1 == end.getColumn();

        return endRowCorrect && columnCorrect;
    }

    @Override
    public boolean isMoveWithHitValid(Move move, Board board) {
        //  dostep do board zeby wyciagnac size() ???   getem jakikolwiek wiersz i jego rozmiar ?
//        iterowac po kolejnych polach zeby sprawdzic czy sa wolne...
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();
//        if (board.getFigure(move.getEndPosition().getRow(), move.getEndPosition().getColumn()) instanceof None) {
//            return true;
//        } else {
            return false;
//        }
    }

    @Override
    String getFigureSign() {
        return "Q";
    }
}
