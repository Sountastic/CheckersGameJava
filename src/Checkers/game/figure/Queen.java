package Checkers.game.figure;

import Checkers.game.Move;

public class Queen extends Figure {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValidForFigure(Move move) {
        return false;
    }

    @Override
    String getFigureSign() {
        return "Q";
    }
}
