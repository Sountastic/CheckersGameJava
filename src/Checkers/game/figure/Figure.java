package Checkers.game.figure;

import Checkers.game.Move;

public abstract class Figure {
    protected Color color;

    public enum Color {
        WHITE(1), BLACK(-1), NONE(0);

        public final int direction;

        Color(int direction) {
            this.direction = direction;
        }
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

    public abstract boolean isMoveValidForFigure(Move move);

    abstract String getFigureSign();

    @Override
    public String toString() {
        return getColorSign() + getFigureSign();
    }
}
