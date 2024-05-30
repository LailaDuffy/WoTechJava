// Easy -> Initialize a string array and try to input and output data
//  We want to define an array city names.
//  We want to add values to it (could be through the scanner, or just writing 

// arr[0] = "Riga";


// With scanner
// arr[0] = scanner.nextLine();


// And then output the values out of array

// Challenging -> Find the largest number in the array and find the smallest number in the array

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] cityNames = new String[5];

    System.out.println("Please enter 5 city names: ");

    for (int i = 0; i < cityNames.length; i++) {
      cityNames[i] = scanner.nextLine();
    }

    System.out.println("You entered the following city names: ");
    for (String city : cityNames) {
      System.out.println(city);
    }

    scanner.close();
    

    // int[] numbers = new int[10];
    // System.out.println("Please write 10 numbers");

    // for (int i = 0; i < numbers.length; i++) {
    //   numbers[i] = scanner.nextInt();
    // }

    // int largest = numbers[0];
    // for (int i = 1; i < numbers.length; i++) {
    //   if (numbers[i] > largest) {
    //     largest = numbers[i];
    //   }
    // }
    // System.out.println("The largest number is: " + largest);

    // int smallest = numbers[0];
    // for (int i = 0; i < numbers.length; i++) {
    //   if (numbers[i] < smallest) {
    //     smallest = numbers[i];
    //   }
    // }
    // System.out.println("Smallest number is: " + smallest);

    // scanner.close();    
  }
}
