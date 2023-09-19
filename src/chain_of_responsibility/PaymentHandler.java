package chain_of_responsibility;

public abstract class PaymentHandler {
    public PaymentHandler successor;

    public void setSuccessor(PaymentHandler successor) {
        this.successor = successor;
    }

    public abstract void handle(Receiver receiver);
}

