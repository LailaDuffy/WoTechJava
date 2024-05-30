import java.util.Scanner;

public class Main {

  // this variable can be seen by all the methods in this class
  // all variables in main class have to be defined as static
  static int sharedValue = 200;
  
  public static void main(String[] args) {

     System.out.println("Let's go and check out what is in the fridge!");
      var isFridgeOpen = false;
      String result; // cannot use var result; as the the program won't know how much of memory to reserve

      if (isFridgeOpen) {
        var item1 = "Cheese";
        var item2 = "Milk";
        var item3 = "Eggs";
        result = item1 + item2 + item3;
      } else {
        result = "Fridge is closed, open the fridge";
      }

      System.out.println(result);
      // ERROR System.out.println(item1);

    // declaring variable in main method
    int mainValue = 14;
    System.out.println(mainValue);
    // method needs to be called in order to run
    firstMethod();
    secondMethod();

    // method examples:
    // authenticateUser();
    // verifyUser();
    // prepareMessage();
    // sendMessage();
    // every method should do one function well
  }

  // METHODS
  // public - availabe to all, seen by all
  // static - 
  // void - the method does it's job and does not return a specific value
  public static void firstMethod(){
    int firstValue = 50;
    System.out.println(firstValue);
  }

  public static void secondMethod(){
    int secondValue = 120;
    System.out.println(secondValue);
  }

}
