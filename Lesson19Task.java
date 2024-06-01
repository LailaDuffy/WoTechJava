import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(4);
    numbers.add(33);
    numbers.add(13);
    numbers.add(65);
    numbers.add(8);
    numbers.add(100);
    numbers.add(7);
    numbers.add(15);
    numbers.add(34);
    numbers.add(4);
    numbers.add(38);
    numbers.add(12);
    numbers.add(66);
    numbers.add(8);
    numbers.add(10);
    numbers.add(72);
    numbers.add(150);

    // Create an integer ArrayList, skip the first 5 numbers. And then with the rest of them, print them out.
    System.out.println("Skip 5: ");
    numbers
      .stream()
      .skip(5)
      .forEach(x -> System.out.println(x));

    System.out.println();

    // Create an integer ArrayList, make sure they divide by 2, skip the first 5, limit to three and print them out from another function.
    System.out.println("All the other stream actions: ");
    numbers
      .stream()
      .filter(x -> x % 2 == 0)
      .skip(5)
      .limit(3)
      .forEach(x -> print(x));
  }

  public static void print(int x) {
    System.out.println();
    System.out.println(x);
  }
}
