package Checkers.game.figure;

import Checkers.game.Board;
import Checkers.game.move.Move;
import Checkers.game.move.Position;

public class Pawn extends Figure {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isMoveValidForFigure(Move move, Board board) {
        return isMoveDiagonalToEmptyField(move, board, 1);
    }

    @Override
    public boolean isMoveWithHitValid(Move move, Board board) {
        return isMoveDiagonalToEmptyField(move, board, 2);
        //sprawdzic czy jest figura przeciwnika
    }

    private boolean isMoveDiagonalToEmptyField(Move move, Board board, int stepLength) {
        Position start = move.getStartPosition();
        Position end = move.getEndPosition();
        boolean endRowCorrect = start.getRow() + stepLength * color.direction == end.getRow();
        boolean endColumnCorrect = start.getColumn() - stepLength == end.getColumn() || start.getColumn() + stepLength == end.getColumn();
        return (isTargetEmpty(board, end) && endRowCorrect && endColumnCorrect);
    }

    private boolean isTargetEmpty(Board board, Position end) {
        return board.getFigure(end.getRow(), end.getColumn()) instanceof None;
    }

    @Override
    String getFigureSign() {
        return "P";
    }

}
