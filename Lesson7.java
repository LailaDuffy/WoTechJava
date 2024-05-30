import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

   // Scanner scanner = new Scanner(System.in);
   // System.out.println("Write a number: ");
   // int a = scanner.nextInt();
   // System.out.println("Write another number: ");
   // int b = scanner.nextInt();

   //  System.out.println("A sum of the two numbers is: " + (a + b));
     
   // scanner.close(); // closing the scanner input listening channel 


    // while loops
    int amountOfTImes = 10;
    
    while (amountOfTImes != 0) {
      System.out.println("Duck!");
      amountOfTImes--;
    }
    System.out.println();

    int i = 0;

    while (i < 10) {
      System.out.println(i);
      i++;
    }
    System.out.println();

    // program that counts from 1 to 10 and provides weather or not the number is even or odd

    int j = 1; // first number is always 1
    boolean isEven = false; // first number is always odd
     // without using modulus
    while (j <= 10) {
      String evenOrOdd = "";
      if (isEven == true) {
        evenOrOdd = "even";
      }
      else {
        evenOrOdd = "odd";
      }
      System.out.println(j + " is " + evenOrOdd);
      j++;
      isEven = !isEven;
    }
    System.out.println();

    int k = 1;
    // with modulus operator
    while (k <=10) {
      if (k % 2 == 0) {
        System.out.println(k + " is even");
      }
      else {
        System.out.println(k + " is odd");
      }
      k++;
    }  
    System.out.println();


    // for loops
    // int i = 0; define the start point
    // i < 10; define the end point
    // i++ define the step
    for (int l = 1; l <= 10; l++) {
     System.out.println(l); 
    }
    System.out.println();
    
  }
}
