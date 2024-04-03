public class Main {
  public static void main(String[] args) {
    // LOGIC
    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimsuit, raincoat
    // Write a program where the clothing is selected based on season
    String season = "autumn";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimsuit!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a raincoat!");
    }
    else {
      System.out.println("Invalid season");
    }
  
    
    int temperature = 14;
  
    if (temperature < 5) {
      System.out.println("Heating on!");
    }
    else if (5 <= temperature && temperature < 15) {
      System.out.println("Heating to be adjusted!");
    }
    else if (15 <= temperature && temperature < 30) {
      System.out.println("Heating off!");
    }
    else if (temperature >= 30) {
      System.out.println("Cooling on");
    }
    else {
      System.out.println("Invalid temperature");
    }

    
  }
}
