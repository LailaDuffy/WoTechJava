import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<PaymentService> list = new ArrayList<PaymentService>();

        SEBPaymentService sebService1 = new SEBPaymentService();
        list.add(sebService1);
        sebService1.currency = "$";
        sebService1.amount = 500;
        sebService1.clientAddress = "IBAN5585002";
        sebService1.description = "Sofa";

        SEBPaymentService sebService2 = new SEBPaymentService();
        list.add(sebService2);
        sebService2.currency = "EUR";
        sebService2.amount = 20;
        sebService2.clientAddress = "IBAN5587412";
        sebService2.description = "Hat";

        SwedPaymentService swedService1 = new SwedPaymentService();
        list.add(swedService1);
        swedService1.currency = "$";
        swedService1.amount = 30;
        swedService1.clientAddress = "IBAN4005857";
        swedService1.description = "Sun hat";

        SwedPaymentService swedService2 = new SwedPaymentService();
        list.add(swedService2);
        swedService2.currency = "EUR";
        swedService2.amount = 200;
        swedService2.clientAddress = "IBAN4007412";
        swedService2.description = "Dress";

        for (PaymentService service : list) {
            service.printInfo();
            System.out.println(service.currency);
            service.sendPayment();
        }

    }
}
