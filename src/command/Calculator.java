package command;

public class Calculator {
    private ArithmeticUnit arithmeticUnit;
    private ControlUnit controlUnit;

    public Calculator() {
        arithmeticUnit = new ArithmeticUnit();
        controlUnit = new ControlUnit();
    }

    private double run(Command command) {
        controlUnit.storeCommand(command);
        controlUnit.executeCommand();
        return arithmeticUnit.getRegister();
    }

    public double add(double operand) {
        return run(new AddCommand(arithmeticUnit, operand));
    }

    public double sub(double operand) {
        return run(new SubCommand(arithmeticUnit, operand));
    }

    public double mul(double operand) {
        return run(new MulCommand(arithmeticUnit, operand));
    }

    public double div(double operand) {
        return run(new DivCommand(arithmeticUnit, operand));
    }

    public void undo() {
        controlUnit.undo();
    }

    public void redo() {
        controlUnit.redo();
    }

    public void redoAll() {
        controlUnit.redoAll();
    }
}