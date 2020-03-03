package Checkers.game.figure;

public class Pawn extends Figure {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    String getFigureSign() {
        return "P";
    }

}
