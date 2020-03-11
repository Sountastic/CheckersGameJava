package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.Move;
import Checkers.util.Position;

public class Pawn extends Figure {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    String getFigureSign() {
        return "P";
    }

    @Override
    public boolean isMoveValidForFigure(Move move) {
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();

        boolean endRowCorrect = start.getRow() + color.direction == end.getRow();
        boolean columnCorrect = start.getColumn() - 1 == end.getRow() || start.getColumn() + 1 == end.getColumn();

        return endRowCorrect && columnCorrect;
    }
}
