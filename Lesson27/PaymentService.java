public class PaymentService {
    protected String clientAddress;
    protected int amount;
    protected String description;
    protected String currency;

    protected void sendPayment() {
        System.out.println("This is a payment to service");
    }

    protected void printInfo() {
        System.out.println("INFO");
    }
}
