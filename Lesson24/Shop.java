import java.util.ArrayList;

public class Shop {  
  // shop and item manager in one
  // cart functionality
  // item management functionality
  // checkout - get all the items in the cart and show the total price

  // ITEM MANAGET FUNCTIONALITY
  //addItem
  //removeItem
  //updateItem

  // SHOP FUNCTIONALITY
  // addItemToCart
  // removeItemFromCart
  // Checkout

  private ArrayList<Item> items = new ArrayList<Item>();
  private ArrayList<Item> cart = new ArrayList<Item>();

  public ArrayList<Item> getItems() {
    return items;
  }
  
  public void addItem(Item item) {
    // add item to the list
    items.add(item);
  }

  public void removeItem(int itemID) {
    for (Item item : items) {
      if (item.getId() == itemID) {
        items.remove(item);
        return;
      }
    }
  }

  public void updateItem(int itemID, String name, int cost) {
    for (Item item : items) {
      if (item.getId() == itemID) {
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }

  public void addItemToCart(Item item) {
    // items list needed where amount available would be known
    // before we add item to cart, it would be checked if it's available
    cart.add(item);
  }

  public void removeItemFromCart(int itemID) {
    for (Item item : cart) {
      if (item.getId() == itemID) {
        cart.remove(item);
        return;
      }
    }
  }

  public int checkout() {
    int sum = 0;
    for (Item item : cart) {
      sum += item.getCost();
    }
    return sum;
  }
}
