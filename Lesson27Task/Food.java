public class Food {
    protected String name;
    protected String description;
    protected float price;
    protected String portionSize;

    protected void orderFood() {
        System.out.println("You have ordered " + this.name + ". It costs " + this.price);
    }

    protected void cookFood() {
        System.out.println("The food is being prepared");
    }

    protected void serveFood() {
        System.out.println("The food has been served. Enjoy!");
    }
}
