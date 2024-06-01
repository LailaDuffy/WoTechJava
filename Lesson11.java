
public class Main {
  public static void main(String[] args) {
    // methods (aka functions)

    // calling a method
    printOutABorder();
    System.out.println("Hello world!");
    printOutABorder();   

    int number = getARandomNumber();
    System.out.println("The random number is: " + number);

    int result = sum(5, 7);
    System.out.println("The sum is: " + result);
  }

  // define the code within the method
  // public - can be accessed anywhere
  // static - does not need an object to be called
  // void - does not return a value
  public static void printOutABorder() {
    // function starts here
    System.out.println("===============");

    // function ends here
  }

  // not void, as it will reurn an int
  public static int getARandomNumber() {
    int number = (int) (Math.random() * 10);
    return number;
  }

  // writing the (variable type and name, etc...)
  public static int sum(int a, int b) {
    return a + b;
  }  
}
