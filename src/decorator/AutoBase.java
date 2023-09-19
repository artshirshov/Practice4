package decorator;

public abstract class AutoBase {
    protected String name;
    protected String description;
    protected double costBase;

    public abstract double getCost();

    public String toString() {
        return String.format("Ваш автомобиль:\n%s\nОписание: %s\nСтоимость: %.2f\n", name, description, getCost());
    }
}
