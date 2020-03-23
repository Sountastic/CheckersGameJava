package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;
import Checkers.game.figure.Pawn;
import Checkers.game.move.Move;
import Checkers.game.move.Position;

import java.util.*;

public class Board {
    public List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 8; i++) {
            rows.add(new BoardRow());
        }
    }

    public Figure getFigure(int row, int col) {
        return rows.get(row).getCols().get(col);
    }

    public Figure getFigure(Position position) {
        return getFigure(position.getRow(), position.getColumn());
    }

    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).getCols().set(col, figure);
    }

    public void init() {
        for (int row = 0; row < rows.size(); row++)
            fillRow(row);
    }

    private void fillRow(int row) {
        Figure.Color color = (row < 4) ? Figure.Color.WHITE : Figure.Color.BLACK;
        int dX = (row % 2 == 0) ? 0 : 1;
        for (int col = 0; col < rows.size(); col++) {
            Figure figure;
            if (row < 3 || row > 4) {
                figure = (col % 2 == dX) ? new Pawn(color) : new None();
            } else {
                figure = new None();
            }
            setFigure(row, col, figure);
        }
    }

    @Override
    public String toString() {

//        String s = "|-----------------------|\n";
        String s = "   ";
        char startLetter = 'A';
        for (int j = 0; j < 8; j++) {
            s += " " + startLetter++ + " ";
        }
        s += "\n";
        for (int i = 0; i < rows.size(); i++) {
            s += (rows.size() - i) + " " + rows.get(i).toString();
        }
//        s += "  |-----------------------|\n";
        return s;
    }

    public void makeMove(Move move) {
        Figure f = getFigure(move.getStartPosition().getColumn(), move.getStartPosition().getRow());
        setFigure(move.getEndPosition().getColumn(), move.getEndPosition().getRow(), f);
        setFigure(move.getStartPosition().getColumn(), move.getStartPosition().getRow(), new None());
    }

    private boolean isValidMove(Move move) {
        Figure figureOnStartField = getFigure(move.getStartPosition());
        Figure figureOnEndField = getFigure(move.getEndPosition());

//        if (figureOnStartField.isMoveValidForFigure(move)) {
//            if (figureOnEndField instanceof None) {
//                if (isMoveLegal(move)) {
//                    return true;
//                }
//            }
//        }
        return false;
    }
}
