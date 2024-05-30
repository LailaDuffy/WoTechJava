import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // opening a channel for user input
    System.out.println("Let's make a triangle!");
    System.out.println("Enter a positive whole number: ");
    int number = scanner.nextInt(); // waiting for a number input from the user to save as number

    for (int i = 0; i <= number; i++) { // create counter variable i, set it to 0, and increment it by 1 each time the loop runs
      String line = "_";
      System.out.println(line.repeat(i));  
   }
    System.out.println();

    System.out.println("Another triangle!");
    String line = "";
    for (int i = 1; i <= number; i++) {      
      line = line + "_";
      System.out.println(line);             
    } 
    System.out.println();

    System.out.println("Mirrorred triangle");
    // x = number
    // spaces = x - i
    // underscores = i
    String result = "";
    String space = " ";
    String underscore = "_";

    for (int i = 1; i <= number; i++) {
      int spacesCount = number - i;
      String lineResult = space.repeat(spacesCount);
      String underscoresResult = underscore.repeat(i);
      lineResult = lineResult + underscoresResult;
      System.out.println(lineResult);
    }
    System.out.println();
    
    System.out.println("Let's play a number guessing game!");
    System.out.println("I have a whole number between 0 and 100 in mind. Can you guess it?");
    System.out.println("Write your guess here: ");
    
    int guess = scanner.nextInt();
    int randomNumber = (int) (Math.random() * 100);

    while (guess != randomNumber) {
      if (guess < randomNumber) {
        System.out.println("Higher!");
      } else {
        System.out.println("Lower!");
      }
      System.out.println("Try again: ");
      guess = scanner.nextInt();
    }
    System.out.println("You got it! Well done!");
    scanner.close();
  }  
}
