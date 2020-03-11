package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;
import Checkers.game.figure.Pawn;
import Checkers.util.Position;

import java.util.*;

public class Board {
    public List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 8; i++) {
            rows.add(new BoardRow());
        }
    }

    //TODO Implement me! PLz
    public boolean isMoveLegal(Move move) {
       return true;
    }

    public Figure getFigure(int row, int col) {
        return rows.get(row).getCols().get(col);
    }

    public Figure getFigure(Position position) {
        return getFigure(position.getRow(), position.getColumn());
    }

    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).getCols().set(col,figure);
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
        for(int j = 0; j < 8; j++) {
            s += " " + startLetter++ + " ";
        }
        s += "\n";
        for (int i = 0; i < rows.size(); i++) {
            s += (rows.size()-i)  + " " + rows.get(i).toString();
        }
//        s += "  |-----------------------|\n";
        return s;
    }
}
