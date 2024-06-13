import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();
    private static Shop shop = new Shop();
  
    public static void main(String[] args) {
      while (true) {
        System.out.println("Welcome!");
        System.out.println("Please enter 1 if you are the Shop Manager");
        System.out.println("Please enter 2 if you are the Customer");
        System.out.println("Plese enter 3 if you want to exit");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
          adminMenu();
        } else if (userInput == 2) {
          customerMenu();
        } else {
          System.out.println("Thank you for visiting! Have a nice day!");
          break;
        }
      }
    }

    public static void addItem(){
      System.out.println("Provide an item ID: ");
      int id = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Provide an item name: ");
      String name = scanner.nextLine();
      System.out.println("Provide an item cost: ");
      int cost = scanner.nextInt();
      scanner.nextLine();
      Item item = new Item(id, name, cost);
      itemService.addItem(item);
    }

    public static void printItems() {
      System.out.println("These are the items in the storage: ");
      ArrayList<Item> items = itemService.getItems();
      for (Item item : items) {
        System.out.println("ID: " + item.getId() + " ; name: " + item.getName() + " ; cost: "+ item.getCost());
      }
    }

    public static void removeItem() {
      System.out.println("Provide an item ID: ");
      int id = scanner.nextInt();
      scanner.nextLine();
      itemService.removeItem(id);
    }

    public static void updateItem(){
      System.out.println("Provide an item ID: ");
      int id = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Please enter updated item name: ");
      String name = scanner.nextLine();
      System.out.println("Please enter updated item cost: ");
      int cost = scanner.nextInt();
      scanner.nextLine();
      itemService.updateItem(id, name, cost);
      System.out.println("Item updated");
    }

    public static void addItemToCart() {
      System.out.println("Search the item by name: ");
      String name = scanner.nextLine();
      ArrayList<Item> items = itemService.getItems();
      for (Item item : items){
        if (item.getName().equalsIgnoreCase(name)) {
          shop.addItemToCart(item);
        }
      }
    }

    public static void printCart() {
      System.out.println("These are the items in the cart: ");
      ArrayList<Item> cart = shop.getCart();
      for (Item item : cart) {
        System.out.println("ID: " + item.getId() + " ; name: " + item.getName() + " ; cost: "+ item.getCost());
      }
    }

    public static void removeItemFromCart() {
      System.out.println("Search the item by name to remove from the cart: ");
      String name = scanner.nextLine();
      ArrayList<Item> cart = shop.getCart();
      for (Item item : cart){
        if (item.getName().equalsIgnoreCase(name)){
          shop.removeItemFromCart(name);
          System.out.println(item.getName() + " removed from cart");
          return;
        }
      }
    }

    public static int checkout(){
      return shop.checkout();
    }

    public static void adminMenu() {
      while (true) {
        System.out.println("Welcome to Shop Manager!");
        System.out.println("Enter 1 to add an item to the inventory");
        System.out.println("Enter 2 to print the list of items");
        System.out.println("Enter 3 to remove an item from the inventory");
        System.out.println("Enter 4 to update an item in the inventory");
        System.out.println("Enter 5 to exit");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
          addItem();
        } else if (userInput == 2) {
          printItems();
        } else if (userInput == 3) {
          removeItem();
        } else if (userInput == 4) {
          updateItem();
        } else {
          System.out.println("You chose to exit the Shop Manager menu");
          break;
        }         
      }
    }

    public static void customerMenu() {
      while (true) {
        System.out.println("Welcome to the Shop!");
        System.out.println("Enter 1 to add an item to your cart");
        System.out.println("Enter 2 to view items in the cart");
        System.out.println("Enter 3 to remove an item from the cart");
        System.out.println("Enter 4 to checkout");
        System.out.println("Enter 5 to exit");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            addItemToCart();
        } else if (userInput == 2) {
            printCart();
        } else if (userInput == 3) {
            removeItemFromCart();
        } else if (userInput == 4) {
            System.out.println("Your total is: " + checkout());
        } else {
            System.out.println("You chose to exit the shop");
            break;
        }         
      }
    }
}
