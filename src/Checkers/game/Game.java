package Checkers.game;

import Checkers.game.move.Move;
import Checkers.game.move.Position;

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

//    public void move(){
//        Position start = new Position();
//        Position end = new Position();
//        Move move = new Move(start, end);
//        board.makeMove(move);
//    }
}
