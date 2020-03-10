package Checkers.game;

import Checkers.game.figure.Figure;

import java.util.Scanner;

public class Position {
    Scanner scanner = new Scanner(System.in);
    int fromRol = scanner.nextInt();
    int toRoow = scanner.nextInt();
    int fromCw = scanner.nextInt();
    int toCol = scanner.nextInt();
    private Board board;

    public void getPosition(int fromRow, int fromCol) {
        Figure fromFigure = board.getFigure(fromRow, fromCol);
    }

    public void setPosition(int toRow, int toCol) {
        board.setFigure(toRow, toCol, );
    }
}
