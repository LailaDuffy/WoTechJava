public class Glass {

  public String color;
  public String material;
  public int fullness = 0; // 0 to 100% full
  public int volume; // ml

  // constructor 
  public Glass(String material, String color, int volume) {
    this.material = material;
    this.color = color;
    this.volume = volume;
  }

  // fill up glass
  public void fill() {
    if ( fullness < 100) {
    fullness = fullness + 1;
    } else {
      System.out.println("Glass is already filled");
    }
  }

  // empty the glass
  public void drink() {    
    if (fullness > 0) {
      fullness = fullness - 1;
    } else {
      System.out.println("The glass is empty!");
    }
  }
}
