import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Food> menu = new ArrayList<>();
        Pizza meatballPizza = new Pizza();
        meatballPizza.name = "Meatball Pizza";
        meatballPizza.description = "Pizza with meatballs and cheese";
        meatballPizza.price = 15.50f;
        meatballPizza.portionSize = "Large";
        meatballPizza.type = "Sourdough";

        Burger beefBurger = new Burger();
        beefBurger.name = "Beef burger";
        beefBurger.description = "Burger with a beef patty";
        beefBurger.price = 20.00f;
        beefBurger.portionSize = "Double XXL";

        menu.add(meatballPizza);
        menu.add(beefBurger);

        while (true) {
            System.out.println();
            System.out.println("Welcome to the restaurant!");
            System.out.println("Here's the Menu: ");
            menu.forEach(food -> {
                System.out.println(food.name);
                System.out.println(food.description);
                System.out.println(food.price);
                System.out.println(food.portionSize);
            });
            System.out.println("What would you like to order?");
            System.out.println("If you changed your mind, enter 0 to exit");
            String userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("0")) {
                for (Food food : menu) {
                    if (userInput.equalsIgnoreCase(food.name)) {
                        food.orderFood();
                        food.cookFood();
                        food.serveFood();
                    }
                }
            } else {
                System.out.println("You have left the restaurant.");
                break;
            }
        }
    }
}
