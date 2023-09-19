package command;

abstract class Command {
    protected ArithmeticUnit unit;
    protected double operand;

    public abstract void execute();

    public abstract void unExecute();
}