package command;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = 0;
        result = calculator.add(5);
        System.out.println(result);
        result = calculator.sub(2);
        System.out.println(result);
        result = calculator.mul(3);
        System.out.println(result);
        result = calculator.div(4);
        System.out.println(result);
        calculator.undo();
        System.out.println(result);
        calculator.redo();
        System.out.println(result);
        calculator.redoAll();
        System.out.println(result);
    }
}
