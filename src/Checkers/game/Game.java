package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.None;
import Checkers.game.move.Move;
import Checkers.game.move.UserDialogues;

public class Game {
    private Board board = new Board();

    public void displayBoard() {
        System.out.println(board);
    }

    public Board getBoard() {
        return board;
    }

    public void init() {
        board.init();
    }

    public void doMove(Move move) {
//        Figure selectedFigure = board.getFigure(move.getStartPosition());
//        if (selectedFigure.isMoveValidForFigure(move, board)) {
//            changeFigurePlace(move, selectedFigure);
//        } else if (selectedFigure.isMoveWithHitValid(move, board)) {
//            doHit(move);
//            changeFigurePlace(move, selectedFigure);
//        }
        board.makeMove(move);
    }

    private void changeFigurePlace(Move move, Figure figure) {
        board.setFigure(move.getEndPosition(), board.getFigure(move.getStartPosition()));
        board.setFigure(move.getStartPosition(), new None());
    }

    private void doHit(Move move) {
        changeFigurePlace(move, board.getFigure(move.getStartPosition()));
        changeFigurePlace(move, board.getFigure(move.getStartPosition().getRow() + 1, move.getStartPosition().getColumn() + 1));
    }
}
