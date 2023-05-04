package go;

import java.util.Scanner;

public class GameLogic {
    private GoBoard board;

    public void startGame() {
        System.out.println("Game started");
        this.board = new GoBoard();

        while (true) {
            board.render();
            Position position = userInput();
            placePiece(position);
            if (board.isGameOver()) {
                break;
            }
        }

        System.out.println("Game over! player: " + String.valueOf(board.getWinner()) + " won!");
    }

    public void placePiece(Position position) {
        this.board.placePiece(position);
    }

    private Position userInput() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter x coordinate: ");
                int x = scanner.nextInt();
                System.out.println("Enter y coordinate: ");
                int y = scanner.nextInt();
                return new Position(x, y);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, try again");
                System.out.println(e.getMessage());
            }
        }
        
    }

    


}
