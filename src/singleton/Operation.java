package singleton;

public class Operation {

    public static double run(char operationCode, int operand) {
        Log lg2 = Log.getMyLog();
        double result = 0;

        switch (operationCode) {
            case '+':
                result += operand;
                lg2.logExecution("Сложение " + operand);
                break;
            case '-':
                result -= operand;
                lg2.logExecution("Вычитание " + operand);
                break;
            case '*':
                result *= operand;
                break;
            case '/':
            case ':':
                result /= operand;
                break;
        }

        return result;
    }
}
