package singleton;

public class Program {
    public static void main(String[] args) {
        Log lg = Log.getMyLog();
        lg.logExecution("Метод Main()");

        double op = Operation.run('-', 35);
        op = Operation.run('+', 30);
    }
}
