package Checkers.game;

import Checkers.game.figure.Figure;
import Checkers.game.figure.Pawn;

public class Game {
    private Board board = new Board();

    public void init() {
        for (int row = 0; row < Board.size; row++) {
            for (int col = 0; col < Board.size; col++) {
                if (row < 3) {
//                    if ((row % 2) - (col % 2) == 0) {
//                        board.setFigure(row, col, new Pawn(Figure.Color.WHITE));
//                    }
//                } else if (row > 4) {
//                    if ((row % 2) - (col % 2) > 0) {
//                        board.setFigure(row, col, new Pawn(Figure.Color.BLACK));
//                    }
                    if ((row % 2) != 0) {
                        for (col = 1; col < 8; col += 2) {
                            board.setFigure(row, col, new Pawn(Figure.Color.BLACK));
                        }
                    }
                } else {
                    for (col = 0; col < 8; col += 2) {
                        board.setFigure(row, col, new Pawn(Figure.Color.BLACK));
                    }
                }
            }
        }
    }

    public void displayBoard() {
        System.out.println(board);
    }

    public Board getBoard() {
        return board;
    }
}
