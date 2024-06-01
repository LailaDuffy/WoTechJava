import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    //Easy: Create an arrayList for integers
    //Add 5 numbers.
    //
    //Filter the arrayList and print out only numbers that divide by 2 
    //(number % 2 == 0)

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter 5 numbers: ");

    do {
      try {             
        int number = scan.nextInt(); 
        numbers.add(number);        
      } catch (Exception e) {
        scan.next();
        System.out.println("Error: " + e + ". Please enter whole numbers!");
      }
    } while (numbers.size() <= 4);

    printArrayList(numbers);
    evenNumbers(numbers);
    
    //Medium: Put 100 random numbers in arrayList
    //
    //Filter the arrayList and print out only numbers that divide by 2 
    //(number % 2 == 0)

    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
    for (int i = 0; i < 100; i++) {
      Random rand = new Random();
      randomNumbers.add(rand.nextInt(1000));
    }
    System.out.println("ArrayList made of 100 random numbers: ");
    printArrayList(randomNumbers);
    evenNumbers(randomNumbers);
  }

  public static void printArrayList(ArrayList<Integer> arrayList) {
    System.out.println("ArrayList: ");
    for (int number : arrayList) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

  public static void evenNumbers(ArrayList<Integer> arrayList) {
    System.out.println("Numbers from the ArrayList that can be divided by 2: ");
    ArrayList<Integer> filteredList = new ArrayList<Integer>();
    for (int number : arrayList) {
      if (number % 2 == 0) {
        filteredList.add(number);
      }
    }
    printArrayList(filteredList);
  }
}
