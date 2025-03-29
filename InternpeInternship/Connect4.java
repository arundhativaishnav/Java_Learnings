package InternpeInternship;
import java.util.Scanner;

public class Connect4 {
    private char[][] board;
    private final int ROWS = 6;
    private final int COLS = 7;

    public Connect4() {
        board = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = ' '; // Initialize the board with empty spaces
            }
        }
    }

    public void displayBoard() {
        System.out.println("*****WELCOME TO CONNECT 4 GAME !*****");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {

                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public int getPlayerInput(char player) {
        Scanner scanner = new Scanner(System.in);
        int column;
        do {
            System.out.print("Player " + player + ", choose a column (0-6): ");
            column = scanner.nextInt();
        } while (column < 0 || column >= COLS || isColumnFull(column));
        return column;
    }

    public boolean dropPiece(int column, char player) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == ' ') {
                board[i][column] = player;
                return true;
            }
        }
        return false; // Column is full
    }

    public boolean isColumnFull(int column) {
        return board[0][column] != ' ';
    }

    public boolean checkWin(char player) {
        return checkHorizontalWin(player) || checkVerticalWin(player) || checkDiagonalWin(player);
    }

    private boolean checkHorizontalWin(char player) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS - 3; c++) {
                if (board[r][c] == player && board[r][c + 1] == player &&
                        board[r][c + 2] == player && board[r][c + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkVerticalWin(char player) {
        for (int c = 0; c < COLS; c++) {
            for (int r = 0; r < ROWS - 3; r++) {
                if (board[r][c] == player && board[r + 1][c] == player &&
                        board[r + 2][c] == player && board[r + 3][c] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalWin(char player) {
        // Check for diagonal (bottom-left to top-right)
        for (int r = 3; r < ROWS; r++) {
            for (int c = 0; c < COLS - 3; c++) {
                if (board[r][c] == player && board[r - 1][c + 1] == player &&
                        board[r - 2][c + 2] == player && board[r - 3][c + 3] == player) {
                    return true;
                }
            }
        }
        // Check for diagonal (top-left to bottom-right)
        for (int r = 0; r < ROWS - 3; r++) {
            for (int c = 0; c < COLS - 3; c++) {
                if (board[r][c] == player && board[r + 1][c + 1] == player &&
                        board[r + 2][c + 2] == player && board[r + 3][c + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Connect4 game = new Connect4();
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            game.displayBoard();
            int column = game.getPlayerInput(currentPlayer);
            game.dropPiece(column, currentPlayer);

            if (game.checkWin(currentPlayer)) {
                game.displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}