package chain_of_responsibility;

public class Receiver {
    private boolean bankTransfer;
    private boolean moneyTransfer;
    private boolean payPalTransfer;

    public Receiver(boolean bankTransfer, boolean moneyTransfer, boolean payPalTransfer) {
        this.bankTransfer = bankTransfer;
        this.moneyTransfer = moneyTransfer;
        this.payPalTransfer = payPalTransfer;
    }

    public boolean isBankTransfer() {
        return bankTransfer;
    }

    public boolean isMoneyTransfer() {
        return moneyTransfer;
    }

    public boolean isPayPalTransfer() {
        return payPalTransfer;
    }
}
