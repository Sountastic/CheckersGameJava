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
            case NONE: return "-";
            case BLACK: return "B";
            case WHITE: return "W";
            default: System.out.println("Unknown color!" + color);
        }
        return null;
    }
}
