public class Item {
  private String name;
  private int cost; // payment by gold pieces

  // constructor that takes care of baseline logic 
  public Item(String name, int cost) {
    this.name = name;
    this.cost = cost;
  }

  // setter for name to control what happens when the name is changed
  public void setName(String name) {
    // do some logic here like add timestamp
    this.name = name;
    // do some other logic like a notification that the name has been changed
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  // getter for name
  public String getName() {
    return name;
  }

  public int getCost() {
    return cost;
  }  
}
