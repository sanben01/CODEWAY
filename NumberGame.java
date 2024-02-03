import java.util.Random; 
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
        Random generator = new Random();
        
        System.out.println("The Guessing Game. Guess a number between 1-100");
        System.out.println("You have 5 attempts!");
        
        int guess = 0; 
        int answer = generator.nextInt(100)+1;
        int counter = 1;
        String playAgain;
        boolean gameOver = false;
        
        while (guess != answer) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt(); 
            counter++;

            if (guess < answer)  {
                 System.out.println("Your guess " + guess + " is too low. Try again");
                 System.out.println("This is attempt: " + counter);
            } else if (guess > answer) {
                 System.out.println("Your guess " + guess + " is too high. Try again");
                 System.out.println("This is attempt: " + counter);
            } else if (guess == answer) {
                 System.out.println("Your guess " + guess + " is correct! You win!");
                 System.out.println();
                 System.out.println("Would you like to play again (Y/N)?");
                 playAgain = input.next();
            } 

        }
        if (counter == 3) {
            System.out.println("Sorry, you've reached your max atttempts.");
            System.out.println("Would you like to play again (Y/N)?"); 
            playAgain = input.next();
        }

        // Play again logic
        boolean isValid;
        do {
            System.out.print("Would you like to play again (Y/N)?");
            playAgain = input.next().toUpperCase();
            isValid = playAgain.equals("Y") || playAgain.equals("N");
            playAgain = input.next();
            counter = 1;
            if ( !isValid ) {
                 System.out.println("Error, please enter Y or N");
                 System.out.println();
            }
        } while (!isValid);
		

	} 

}
