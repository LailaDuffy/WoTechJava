import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get elements

public class Main {
  public static void main(String[] args) {

    // Internet shop example
    // Initialize
    ArrayList<String> shopItems = new ArrayList<String>();

    // ask for user input to add new items
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type an item to add to the shop. Type 'exit' to quit.");
    while (true) {
      String item = scanner.nextLine();
      if (item.equals("exit")) {
        break;
      } else {
        addItem(shopItems, item);
      }
    }

    // Add elements using ArrayList method and using a custom method
    shopItems.add("Table");
    addItem(shopItems, "Cupboard");

    // for each loop to print out all the elements
    printArrayList(shopItems);

    System.out.println("Please type an item to remove from the shop. Type 'exit' to quit.");
    while (true) {
      String itemToRemove = scanner.nextLine();
      if (itemToRemove.equals("exit")) {
        break;
      } else {
        removeItem(shopItems, itemToRemove);  
      }
    }
    
    printArrayList(shopItems);
    System.out.println();

    // filter ArrayList
    ArrayList<String> filteredArrayList = new ArrayList<String>();
    for (String item : shopItems) {
      if (item.length() <= 5) {
        filteredArrayList.add(item);
      }
    }
    System.out.println("Items that have less than 6 characters: " + filteredArrayList);
  }

  // for each loop to print out all the elements
  public static void printArrayList(ArrayList<String> arrayList) {
    clearConsole();
    for (String item : arrayList) {
      System.out.println(item);
    }
  }

  // add items to ArrayList
  public static void addItem(ArrayList<String> arrayList, String item) {
    arrayList.add(item);
    System.out.println(item + " has been added to the store.");
  }

  // special function to clear the console
  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  // remove an item to ArrayList
  public static void removeItem(ArrayList<String> arrayList, String item) {
    arrayList.removeIf(element -> element.equals(item));
    System.out.println(item + " has been removed from the store.");
  }
}
