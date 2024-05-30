/*

We have an array with different numbers {1, 3, 4, 2, 5, 8}

User is providing a number

Check whether or not this number exists in the array
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int[] numbers = { 1, 3, 4, 2, 5, 8 }; // numbers.length = size of the numbers = 6

    System.out.println("Please write your favourite digit");

    Scanner scanner = new Scanner(System.in);
    int favouriteNumber = scanner.nextInt();

    boolean isFound = false;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == favouriteNumber) {
        isFound = true;
        break; //EXITS THE FOR LOOP ALTOGETHER, ignoring the i < numbers.length
      }
    }
    if(isFound) {
      System.out.println("Your favourite number " + favouriteNumber + " is in the array");
    } else {
      System.out.println("Your favourite number " + favouriteNumber + " is NOT FOUND!");
    }
    scanner.close();
  }
}
