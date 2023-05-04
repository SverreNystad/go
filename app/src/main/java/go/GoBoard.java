package go;

import java.util.HashSet;

public class GoBoard {

    private static final int BOARD_SIZE = 19;
    private int boardSize;
    private int[][] board;
    private int currentPlayer;

    public GoBoard() throws IllegalArgumentException {
        this(BOARD_SIZE);
    }

    public GoBoard(int boardSize) throws IllegalArgumentException {
        validateBoardSize(boardSize);
        this.board = new int[boardSize][boardSize];
        this.currentPlayer = 1;
    }

    private static void validateBoardSize(final int boardSize) throws IllegalArgumentException {
        if (boardSize < 0) {
            throw new IllegalArgumentException("Board size must be positive");
        }
    }

    private void validatePosition(final Position position) throws IllegalArgumentException {
        if (position.getX() < 0 || position.getX() > this.boardSize || position.getY() < 0 || position.getY() > this.boardSize) {
            throw new IllegalArgumentException("Position out of bounds");
        }
    }

    public boolean isGameOver() {
        return false;
    }

    public int getWinner() {
        return this.currentPlayer;
    }

    /**
     * A player can place a stone on any vacant intersection on the board, except where doing so would immediately capture one of their own stones.
     * @param position
     */
    public void placePiece(Position position) {
        if (this.board[position.getX()][position.getY()] != 0) {
            throw new IllegalArgumentException("Position already occupied");
        }
        else {
            this.board[position.getX()][position.getY()] = currentPlayer;
        }
        this.currentPlayer *= -1;
    }

    public void render() {
        System.out.println("Board rendered");
    }

    /**
     * When a stone or group of stones is completely surrounded by the opponent's stones, it is captured and removed from the board.
     */
    private void capturePieces() {
        
    }

    /**
     * The piece played must not create a situation where the stone played will be immediately captured with no chance to escape.
     * @return
     */
    private boolean willBeCaptured(final Position position) {
        // Is surrounded by opponent

        
        return false;
    }

    private HashSet<Piece> getAllGroups() {
        HashSet<Piece> groups = new HashSet();
        for (int y = 0; y < this.boardSize; y++) {
            for (int x = 0; x < this.boardSize; x++) {
                if (this.board[x][y] != 0) {
                    // Check if group already exists
                    if ()
                    // If not, create new group
                    // If yes, add to group
                }
            }
        }
        return null;
    }

    private HashSet getSurroundingPieces(final Position position) {
        return null;
    }

    /**
     * A player may not place a stone such that it would recreate a previous board position. This rule prevents unending repetition.
     */
    private void checkForKo() {
        
    }
}
