public class Pizza extends Food{
    public String type;

    @Override
    public void cookFood() {
        System.out.println("Your pizza is being cooked");
    }

    @Override
    protected void serveFood() {
        System.out.println("The pizza has been served. Enjoy!");
    }
}
