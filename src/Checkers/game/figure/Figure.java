package Checkers.game.figure;

public abstract class Figure {
    protected Color color;

    public enum Color {
        WHITE, BLACK, NONE
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected String getColorSign() {
        switch (color) {
            case NONE:
                return " ";
            case BLACK:
                return "b";
            case WHITE:
                return "w";
            default:
                return "x";
        }
    }

    abstract String getFigureSign();

    @Override
    public String toString() {
        return getColorSign() + getFigureSign();
    }
}
