import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();

    // for (int i = 1; i <= number; i++) {
    //   if (i % 3 == 0 && i % 5 == 0) {
    //     System.out.println("WoTech");
    //   }
    //   else if (i % 5 == 0) {
    //     System.out.println("Tech");
    //   }
    //   else if (i % 3 == 0) {
    //     System.out.println("Wo");
    //   }
    //   else {
    //     System.out.println(i);
    //   }      
    // }    
    // scanner.close();
    // System.out.println();

    Scanner input = new Scanner(System.in);
    System.out.println("Please write something: ");
    String userText = input.nextLine();
    
    int boxSideLength = (userText.length() + 4);
    String boxTopBottom = "=";
    String boxSides = "|";
    String emptySpace = " ";

    System.out.println("Let me box that up for you!");

    System.out.println(boxTopBottom.repeat(boxSideLength)); // top of the box
    for (int i = 1; i <= (boxSideLength/4 - 1); i++) {
      System.out.print(boxSides);
      System.out.print(emptySpace.repeat(boxSideLength - 2));
      System.out.print(boxSides);
      System.out.println();
    }
    System.out.println(boxSides + " " + userText + " " + boxSides); // middle of the box
    emptyBoxLines(boxSideLength, boxSides, emptySpace);
    }
    System.out.println(boxTopBottom.repeat(boxSideLength)); // bottom of the box

    input.close();      
  }

  public static void emptyBoxLines(int boxSideLength, String boxSides, String emptySpace) {
    for (int i = 1; i <= (boxSideLength/4 - 1); i++) {
      System.out.print(boxSides);
      System.out.print(emptySpace.repeat(boxSideLength - 2));
      System.out.print(boxSides);
      System.out.println();
  }
}
