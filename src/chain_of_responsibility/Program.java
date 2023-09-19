package chain_of_responsibility;

public class Program {
    public static void main(String[] args) {
//        Receiver receiver = new Receiver(false, true, true);
        Receiver receiver = new Receiver(true, false, true);

        PaymentHandler bankPaymentHandler = new BankPaymentHandler();
        PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
        PaymentHandler payPalPaymentHandler = new PayPalPaymentHandler();

//        bankPaymentHandler.setSuccessor(payPalPaymentHandler);
//        payPalPaymentHandler.setSuccessor(moneyPaymentHandler);
        bankPaymentHandler.setSuccessor(moneyPaymentHandler);
        moneyPaymentHandler.setSuccessor(payPalPaymentHandler);


        bankPaymentHandler.handle(receiver);

    }
}
