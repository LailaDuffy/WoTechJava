import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cheese cheese = new Cheese();
        cheese.price = 10;
        cheese.name = "Parmesan";
        cheese.cheeseColor = "red";
        cheese.cheeseType = "cheddar";

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(cheese);

        Wine wine = new Wine();
        wine.price = 7;
        wine.name = "Chardonnay";
        wine.type = "White";
        wine.age = 15;
        wine.country = "Austria";
        items.add(wine);

        System.out.println("These are all the things I can sell to you:");
        for(Item item : items){
            System.out.println(item.name);
            System.out.println(item.price);
            if (item instanceof Wine) {
                Wine wines = (Wine) item;// to access particular subclass cast it as a subclass of the superclass
                System.out.println(wines.type);
                System.out.println(wines.country);
                System.out.println(wines.age);
            } else if (item instanceof Cheese) { // another way to access the subclass properties
                System.out.println(((Cheese) item).cheeseType);
                System.out.println(((Cheese)item).cheeseType);
            }
        }
    }
}
