public class Main {
  public static void main(String[] args) {

    Glass waterGlass = new Glass("crystal", "blue", 500);

    System.out.println("The glass is made of " + waterGlass.material);
    System.out.println("Its color is " + waterGlass.color);
    System.out.println("Right now the glass is " + waterGlass.fullness + " percent full.");
    System.out.println("The volume of this glass is " + waterGlass.volume + "ml");
    
    // fill up the glass
    for (int i = 0; i < 101; i++) {
      waterGlass.fill();
    }
    System.out.println("The glass is " + waterGlass.fullness + " percent full.");

    // drink from the glass
    for (int i = 0; i < 50; i++) {
      waterGlass.drink();
    }
    System.out.println("The glass is " + waterGlass.fullness + " percent full.");

    for (int i = 0; i < 55; i++) {
      waterGlass.drink();
    }
  }  
}
