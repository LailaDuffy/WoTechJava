import java.util.ArrayList;

public class ItemService {
  // item management functionality

  // ITEM MANAGET FUNCTIONALITY
  //addItem
  //removeItem
  //updateItem

  private ArrayList<Item> items = new ArrayList<Item>();

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
}
