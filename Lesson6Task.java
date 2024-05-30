import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner firstIngredient = new Scanner(System.in);
    System.out.println("Please write a name of a vegetable: ");
    String vegetable = firstIngredient.nextLine();
    

    Scanner secondIngredient = new Scanner(System.in);
    System.out.println("Please write a name of spice: ");
    String spice = secondIngredient.nextLine();

    Scanner noOfGuests = new Scanner(System.in);
    System.out.println("Please write a positive whole number: ");
    int numberOfPeople = noOfGuests.nextInt();

    System.out.println("We are making a soup, first let's take " + vegetable + ". Let's peel the " + vegetable + " and then put it in a pot. Next, we will add " + spice + " and then we will boil the soup for 10 minutes. After that, we will take the soup out and serve it to the " + numberOfPeople + " people.");
  }
}
