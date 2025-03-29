package InternpeInternship;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //GENERATE A RANDOM NUMBER BETWEEN 1 TO 100
        int NumberToGuess = random.nextInt(100)+1;
        int NumberOfTries =0;
        boolean hasguessedcorrect = false;

        System.out.println("Welcome to number guessing game");
        System.out.println("I have selected a number between 1 to 100 ");

        //loop for game
        while(!hasguessedcorrect){
            System.out.println("Enter your guess: ");
            int Playerguess = scanner.nextInt();
            NumberOfTries++;

            if(Playerguess < 1|| Playerguess >100){
                System.out.println("Please guess number between 1 to 100");
            }else if(Playerguess< NumberToGuess){
                System.out.println("Too low! Try again");
            }else if(Playerguess> NumberToGuess){
                System.out.println("Too high! Try again");
            }else{
                hasguessedcorrect= true;
                System.out.println("Congratulations ! You have guess the correct number "+ NumberToGuess + " in " + NumberOfTries + "tries .");

            }
        }

    }
}
