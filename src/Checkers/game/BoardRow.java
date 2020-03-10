package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;

import java.util.*;

public class BoardRow {
    private List<Figure> cols = new ArrayList<>();

    public BoardRow() {
        for (int i = 0; i < 8; i++) {
            cols.add(new None());
        }
    }

    public List<Figure> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int i = 0; i < cols.size(); i++) {
            s += cols.get(i) + "|";
        }
        return s + "\n";
    }
}
