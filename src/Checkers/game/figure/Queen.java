package Checkers.game.figure;

public class Queen extends Figure {
    public Queen(Color color) {
        super(color);
    }

    @Override
    String getFigureSign() {
        return "Q";
    }

}
