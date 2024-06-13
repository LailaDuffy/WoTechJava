import java.util.ArrayList;

public class Shop {  
  // cart functionality  
  // checkout - get all the items in the cart and show the total price


  // SHOP FUNCTIONALITY
  // addItemToCart
  // removeItemFromCart
  // Checkout
  private ArrayList<Item> cart = new ArrayList<Item>();

  public ArrayList<Item> getCart() {
    return cart;
  }

  public void addItemToCart(Item item) {
    // items list needed where amount available would be known
    // before we add item to cart, it would be checked if it's available
    cart.add(item);
  }

  public void removeItemFromCart(String name) {
    for (Item item : cart) {
      if (item.getName().equalsIgnoreCase(name)) {
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
