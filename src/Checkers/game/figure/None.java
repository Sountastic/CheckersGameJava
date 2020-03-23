package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.move.Move;

public class None extends Figure {
    public None() {
        super(Color.NONE);
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
        return " ";
    }

    public boolean isMoveValidForFigure(Move move) {
        return false;
    }

}
