package chain_of_responsibility;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.isBankTransfer()) {
            System.out.println("Выполняем банковский перевод");
        } else if (successor != null) {
            successor.handle(receiver);
        }
    }
}

