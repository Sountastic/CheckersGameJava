package Checkers.game;

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


}
