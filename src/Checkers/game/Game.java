package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;

public class Game {
    private Board board = new Board();git

    public void displayBoard() {
        System.out.println(board);
    }

    public Board getBoard() {
        return board;
    }

    public void init() {
        board.init();
    }

    public boolean isMoveValid(Move move) {
        Figure figureOnStartField = board.getFigure(move.getStartPosition());
        Figure figureOnEndField = board.getFigure(move.getEndPosition());

        if (figureOnStartField.isMoveValidForFigure(move)) {
            if (figureOnEndField instanceof None) {
                if (board.isMoveLegal(move)) {
                    return true;
                }
            }
        }
        return false;
    }

    // TODO return Result object
    public void makeMove(Move move) {

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
