package Checkers.game.figure;

public class None extends Figure {
    public None() {
        super(Color.NONE);
    }

    @Override
    String getFigureSign() {
        return " ";
    }

}
