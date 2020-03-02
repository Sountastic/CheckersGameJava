package Checkers.game.figure;

public class Pawn extends Figure {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "P" + getColorSign();
    }
}
