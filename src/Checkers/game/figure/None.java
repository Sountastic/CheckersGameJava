package Checkers.game.figure;

public class None extends Figure {
    public None() {
        super(Color.NONE);
    }

    @Override
    public String toString() {
        return "-" + getColorSign();
    }
}
