package Checkers.game;

import Checkers.game.figure.Figure;

import java.util.*;

public class Board {
    public static int size = 8;
    //public int size = 8;
    public List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 8; i++) {
            rows.add(i, new BoardRow(8));
        }
    }

    public Figure getFigure(int row, int col) {
        if (row > 8 || row < 0) {
            return null;
        } else {
            return rows.get(row).getFigure(col);
        }
    }

    public void setFigure(int row, int col, Figure figure) {
        if (row >= 0 && row < 8) {
            rows.get(row).setFigure(col, figure);
        } else {
            System.out.println("Row outside range");
        }
    }

    @Override
    public String toString() {
        String boardView = "";

        for (int i = 0; i < rows.size(); i++) {
            boardView = "\n";
        }
        return boardView;
    }
}
