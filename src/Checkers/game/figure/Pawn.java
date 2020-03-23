package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.move.Move;
import Checkers.game.move.Position;

public class Pawn extends Figure {
    public Pawn(Color color) {
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

    @Override
    String getFigureSign() {
        return "P";
    }

    public boolean isMoveValidForFigure(Move move) {
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();

        boolean endRowCorrect = start.getRow() + color.direction == end.getRow();
        boolean columnCorrect = start.getColumn() - 1 == end.getRow() || start.getColumn() + 1 == end.getColumn();

        return endRowCorrect && columnCorrect;
    }
}
