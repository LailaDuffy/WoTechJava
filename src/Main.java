import java.util.ArrayList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();

        Tree maple = new Tree();
        maple.name = "Maple";
        maple.age = 22;
        maple.hasFruits = false;
        maple.isEvergreen = false;
        maple.type = "Decidous";

        Flower tulip = new Flower();
        tulip.name = "Tulip";
        tulip.age = 1;
        tulip.color = "red";
        tulip.hasOdor = true;
        tulip.season = FloweringSeason.Spring;

        plants.add(maple);
        plants.add(tulip);

        plants.forEach(plant->{
            System.out.println();
            System.out.println("Plant name: " + plant.name);
            System.out.println("Plant age: " + plant.age);
            if (plant instanceof Flower) {
                System.out.println("Plant has odor: " + ((Flower)plant).hasOdor);
                System.out.println("Plant's flowering season: " + ((Flower)plant).season);
                System.out.println("Plant's color: " + ((Flower)plant).color);
            } else if (plant instanceof Tree) {
                System.out.println("Plant has fruits: " + ((Tree)plant).hasFruits);
                System.out.println("Plant is evergreen: " + ((Tree)plant).isEvergreen);
                System.out.println("Plant's type: " + ((Tree)plant).type);
            }
        });
    }
}