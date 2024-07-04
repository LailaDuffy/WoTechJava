public class SEBPaymentService extends PaymentService {

    @Override
    public void sendPayment() {
        System.out.println("This is a payment to SEB service");
    }

    public void printInfo() {
        System.out.println("This is SEB info");
    }
}
