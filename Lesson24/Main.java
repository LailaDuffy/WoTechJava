import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  private static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
    Shop shop = new Shop();
    while (true){
    System.out.println("To add item to store, enter 1");  
    System.out.println("To remove item from store, enter 2");
    System.out.println("To update item in store, enter 3");
    System.out.println("To see items list, enter 4");
    System.out.println("To exit, enter 5");
    int userInput = scan.nextInt();
      if (userInput == 1) {
         shop.addItem(createItem());
      } else if (userInput == 2) {
        System.out.println("Please enter item ID to be removed: ");
        int itemID = scan.nextInt();
        scan.nextLine();
        shop.removeItem(itemID);
      } else if (userInput == 3) {
        System.out.println("Please enter item ID to be updated: ");
        int itemID = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter updated item name: ");
        String name = scan.nextLine();
        System.out.println("Please enter updated item cost: ");
        int cost = scan.nextInt();
        scan.nextLine();
        shop.updateItem(itemID, name, cost);
      } else if (userInput == 4){
        printItems(shop.getItems());    
      } else {
        System.out.println("Youre exiting the program");
        break;
      }
    }    
    scan.close();    
  }

  public static Item createItem() {    
    System.out.println("Please enter item ID: ");
    int itemID = scan.nextInt();
    scan.nextLine();
    Item item1 = new Item(itemID);
    System.out.println("Please enter item name: ");
    String itemName = scan.nextLine();
    item1.setName(itemName);
    System.out.println("Please enter item cost: ");
    int itemCost = scan.nextInt();
    scan.nextLine();
    item1.setCost(itemCost);
    return item1;
  }

  public static void printItems(ArrayList<Item> items) {
    for (Item item : items) {
      System.out.println(item.getId());
      System.out.println(item.getName());
      System.out.println(item.getCost());
    }
  }
}
