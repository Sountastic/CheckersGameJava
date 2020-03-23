package Checkers.game.move;

import java.util.Scanner;

public class UserDialogues {

    public static Move getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (example: A1B2)");
            String s = scanner.nextLine().trim().toUpperCase();
            try {
                String x1 = s.substring(0, 1);
                if (!"ABCDEFGH".contains(x1)) throw new Exception();
                int y1 = Integer.parseInt(s.substring(1, 2));
                if (y1 < 1 || y1 > 8) throw new Exception();
                String x2 = s.substring(2, 3);
                if (!"ABCDEFGH".contains(x2)) throw new Exception();
                int y2 = Integer.parseInt(s.substring(3, 4));
                if (y2 < 1 || y2 > 8) throw new Exception();

                return new Move(
                        new Position(x1.charAt(0) - 65, y1 - 1),
                        new Position(x2.charAt(0) - 65, y2 - 1));

            } catch (Exception e) {
                System.out.println("Wrong move try again.");
            }
        }
    }
}
