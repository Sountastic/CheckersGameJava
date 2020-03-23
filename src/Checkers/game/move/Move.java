package Checkers.game.move;

import Checkers.game.figure.Figure;

public class Move {
    private Position startPosition;
    private Position endPosition;

    public Move(Position startPosition, Position endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
}

    public Position getStartPosition() {
        return startPosition;
    }

    public Position getEndPosition() {
        return endPosition;
    }

    @Override
    public String toString() {
        return "Move{" +
                "startPosition=" + startPosition +
                ", endPosition=" + endPosition +
                '}';
    }
}
