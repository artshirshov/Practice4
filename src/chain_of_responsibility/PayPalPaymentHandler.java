package chain_of_responsibility;

public class PayPalPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.isPayPalTransfer()) {
            System.out.println("Выполняем оплату через PayPal");
        } else if (successor != null) {
            successor.handle(receiver);
        }
    }
}

