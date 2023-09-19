package command;

public class ArithmeticUnit {
    private double register;

    public double getRegister() {
        return register;
    }

    public void run(char operationCode, double operand) {
        switch (operationCode) {
            case '+':
                register += operand;
                break;
            case '-':
                register -= operand;
                break;
            case '*':
                register *= operand;
                break;
            case '/':
                register /= operand;
                break;
        }
    }
}
