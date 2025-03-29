package InternpeInternship;
import java.util.*;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args) {
        // 0 -> stone, 1 -> paper, 2 -> scissor
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("***********WELCOME TO THE GAME ************");

        while (playAgain) {
            System.out.print("1) 0 FOR ROCK \n2) 1 FOR PAPER. \n3) 2 FOR SCISSOR. ");
            System.out.println("\nPlease enter your choice: ");

            int userInput = sc.nextInt();
            int botInput = random.nextInt(3);

            if (userInput == botInput) {
                System.out.println("It's a draw!");
            } else if (userInput == 0 && botInput == 1 || userInput == 1 && botInput == 2 || userInput == 2 && botInput == 0) {
                System.out.println("Sorry, you lost!");
            } else {
                System.out.println("CONGRATULATIONS! You won!");
            }

            if (botInput == 0) {
                System.out.println("Bot chose: Rock");
            } else if (botInput == 1) {
                System.out.println("Bot chose: Paper");
            } else {
                System.out.println("Bot chose: Scissor");
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}