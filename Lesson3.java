
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    var eggPrice = 2.50;
    var money = 30.12;

    // if statement where need to check if there is enough money to buy eggs
    if(eggPrice <= money) {
      // the if statement is true, we can afford to buy eggs
      System.out.println("You can buy the eggs!");
    }
    else {
      // the if statement is false, we cannot afford to buy eggs
      System.out.println("You can't buy the eggs!"); 
    }

    var text = "Light is turned on";
     // if statement where need to check if the light is turned on or not
    if (text == "Light is turned on") {
      System.out.println("The light is on!");
    }
    else {
      System.out.println("The light is not turned on!");
    }

    String username = "Anna";
     // if statement where need to check if username is Anna, as she not invited
    if (username != "Anna") {
      System.out.println("You are invitied to my party!");
    }
    else {
      System.out.println("You are not invited to my party! Sorry!");
    }
  }
}
