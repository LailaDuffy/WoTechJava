/*Guess the Number Game
Generate a random number from 0 to 100
Make the user guess the number. If it's too high, or too low, let the user know
OPTIONAL: Give maximum of 6 guessues.
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Let's play a number guessing game!");
    System.out.println("I have a whole number between 0 and 100 in mind. Can you guess it in 6 tries?");
    System.out.println("Write your guess here: ");

      int guess = scanner.nextInt();
      int randomNumber = (int) (Math.random() * 100);

      guess(guess, randomNumber);

    scanner.close();
  }

  public static void guess(int guess, int randomNumber) {
    Scanner scanner = new Scanner(System.in);
    boolean guessedCorrectly = false;
    for (int i = 0; i <= 5; i++) {
      if (guess < randomNumber) {
        System.out.println("Higher!");
        System.out.println("Try again: ");
        guess = scanner.nextInt();
      } else if (guess > randomNumber) {
        System.out.println("Lower!");
        System.out.println("Try again: ");
        guess = scanner.nextInt();
      } else {
        guessedCorrectly = true;
        break;
      }      
    }
    if (guessedCorrectly){
      System.out.println("You got it! Well done!");
    } else {
      System.out.println("You didn't get it! The number was " + randomNumber);
    }    
  }
}
