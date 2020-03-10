package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;
import Checkers.game.figure.Pawn;

import java.util.Scanner;

public class Game {
    private Board board = new Board();
//    Scanner scanner = new Scanner(System.in);
//    int fromRow = scanner.nextInt();
//    int fromCol = scanner.nextInt();
//    int toRow = scanner.nextInt();
//    int toCol = scanner.nextInt();

    public void displayBoard() {
        System.out.println(board);
    }

    public Board getBoard() {
        return board;
    }

    public void init() {
        board.init();
    }

//    boolean isEmpty = true;

//    public boolean isEmpty() {
//        boolean isEmpty = true;
//        if (board.getFigure(toRow, toCol) == new None()) {
//            isEmpty = true;
//        } else {
//            isEmpty = false;
//        }
//        return isEmpty;
//    }
//
//    public void makeMovePawn() {
//        Figure fromFigure = board.getFigure(fromRow, fromCol);
//        board.setFigure(fromRow, fromCol, new None());
//        if (isEmpty)
//            board.setFigure(toRow, toCol, fromFigure);
//
//    }


}
