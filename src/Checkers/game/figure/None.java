package Checkers.game.figure;

import Checkers.game.Move;

public class None extends Figure {
    public None() {
        super(Color.NONE);
    }

    @Override
    String getFigureSign() {
        return " ";
    }

    @Override
    public boolean isMoveValidForFigure(Move move) {
        return false;
    }

}
