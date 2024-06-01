public class Main {
  public static void main(String[] args) {

    int number = 51;  
    checkNumber(number);

    int number2 = 49;
    // String return method needs to be printed in the main method
    String result = checkNumberReturn(number2);
    System.out.println(result);
  }

  // a function/method replaces the need to write out the same code twice or more
  public static void checkNumber(int number) {
    if (number > 50) {
      System.out.println("Number is greater than 50");
    } else if (number < 50) {
      System.out.println("Number is less than 50");
    } else {
      System.out.println("Number is equal to 50");
    }
  }

  // returning a text instead of system.out.print
  public static String checkNumberReturn(int number) {
    if (number > 50) {
      return "Number is greater than 50";
    } else if (number < 50) {
      return "Number is less than 50";
    } else {
      return "Number is equal to 50";
    }
  }
}
