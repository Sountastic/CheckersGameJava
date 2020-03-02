package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;

import java.util.*;

public class BoardRow {
    public final int length;
    public List<Figure> list = new ArrayList<>();

//    public List<Figure> getList() {
//        return list;
//    }
//
//    public void setList(List<Figure> list) {
//        this.list = list;
//    }

    public BoardRow(int length) {
        this.length = length;
        for (int i = 0; i < length; i++) {
            list.add(new None());
        }
    }


    public Figure getFigure(int index) {
        if (index > length || index < 0) {
            return null;
        } else {
            return list.get(index);
        }
    }

    public void setFigure(int index, Figure figure) {
        if (index <= 0 && index < length) {
            list.set(index, figure);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s = "|" + getFigure(i);
        }
        return s + "|";
    }

    public void displayBoardRow() {
        System.out.println(list);
    }
}
