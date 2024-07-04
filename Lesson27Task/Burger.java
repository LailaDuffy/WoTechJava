public class Burger extends Food{

    @Override
    public void cookFood() {
        System.out.println("Your burger is being cooked");
    }

    @Override
    protected void serveFood() {
        System.out.println("The burger has been served. Enjoy!");
    }
}
