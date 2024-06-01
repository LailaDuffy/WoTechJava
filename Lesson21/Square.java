public class Square {

  public int sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
  }

  public int getPerimeter() { // don't need args because sideLength is in the class scope
    return sideLength * 4;
  }

  public int getArea() {
    return sideLength * sideLength;
  }
}
