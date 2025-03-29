package InternpeInternship;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-'; // Initialize the board with '-'
            }
        }
        char player = 'X';
        boolean gameover = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameover) {
            printTheBoard(board);
            System.out.println("Player " + player + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Validate input
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input! Please enter row and column values between 0 and 2.");
                continue;
            }

            if (board[row][col] == '-') {
                // Place the element
                board[row][col] = player;
                gameover = haveWon(board, player);
                if (gameover) {
                    printTheBoard(board);
                    System.out.println("Player " + player + " has won!");
                } else if (isBoardFull(board)) {
                    printTheBoard(board);
                    System.out.println("The game is a draw!");
                    gameover = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X'; // Switch player
                }
            } else {
                System.out.println("Invalid move, try again!");
            }
        }
        scanner.close();
    }

    private static boolean haveWon(char[][] board, char player) {
        // Check the rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false; // Found an empty cell
                }
            }
        }
        return true; // No empty cells found
    }

    private static void printTheBoard(char[][] board) {
        System.out.println("CURRENT BOARD:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " "); // Use print instead of println
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}