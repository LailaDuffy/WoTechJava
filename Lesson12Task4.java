/*Create a function that returns smallest number of 2 numbers.

For example:
User provides 5
User provides 7

Function returns 5
Main function prints out:
5 is the smallest number

Create a function that returns a multiplication of 3 different numbers
For example: 
User provides 5
User provides 7
User provides 3

Function returns 105
Main function prints out 105

Create a function that returns a combination of first name and last name
User provides "Oskars"
User provides "Klaumanis"

Function receives both of the names and returns "Oskars Klaumanis"
Main function prints out the result
  */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a whole number: ");
    int number1 = scanner.nextInt();
    System.out.println("Please enter another whole number: ");
    int number2 = scanner.nextInt();
    System.out.println("Please enter another whole number: ");
    int number3 = scanner.nextInt();

    String result = compareNumbers(number1, number2);
    System.out.println(result);
    
    int multiplication = multiplyNumbers(number1, number2, number3);
    System.out.println("The result of multiplying three of your numbers is: " + multiplication);

    System.out.println("Please write your name: ");
    String name = scanner.next();
    System.out.println("Please write your surname: ");
    String surname = scanner.next();

    String fullName = getFullName(name, surname);
    System.out.println(fullName);
    
    scanner.close();    
  }

  public static String compareNumbers(int number1, int number2) {
    if (number1 < number2) {
      return number1 + " is the smallest of the first two numbers";
    } else {
      return number2 + " is the smallest of the first two numbers";
    }
  }

  public static int multiplyNumbers(int number1, int number2, int number3) {
    return number1 * number2 * number3;
  }

  public static String getFullName (String name, String surname) {
    return name + " " + surname;
  }
}
