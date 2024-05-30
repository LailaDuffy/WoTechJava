import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // OPTIMIZATION OF THE GROUP TASK 1
    // System.out.println("Please enter a number: ");

    // int number = scanner.nextInt(); //15

    // for(int i = 1; i <= number; i++){
    //   // 1 2 3 4 5 ... 15
    //   String result = "";
    //   if (i % 3 == 0){ // 3 6 9 12 15
    //     result += "Wo";
    //   } 
    //   if (i % 5 == 0){ // 5 10 15
    //     result += "Tech";
    //   } 
    //   if(result.equals("")){ //if result is empty
    //     result = String.valueOf(i); //Then result = i (number)
    //   }
    //   System.out.println(result);

    //   scanner.close();
    // }

    // ARRAYS

    int[] array = {5, 7, 9, 11, 13}; // to create an array with specific items

    System.out.println(array[0]); // to print an item from an array using the index
    System.out.println(array[array.length -1]); // to print the last item form the array

    Scanner scanner = new Scanner(System.in);
    
    int[] array2 = new int[5]; // to create an array with a specific size
    array2[0] = 5;
    array2[1] = 7;
    array2[2] = 9;
    array2[3] = 12;
    array2[4] = 15;

    for (int i = 0; i < array2.length; i++) { // to print out all the items in the array
      System.out.println(array2[i]); 
    }

    int[] array3 = new int[5];
    for(int i = 0; i < array3.length; i++) {
      array3[i] = scanner.nextInt(); // user input determines the numbers in the array
    }

    scanner.close();
  }
}
