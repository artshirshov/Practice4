package decorator;

public class ComfortPackage extends DecoratorOptions {
    public ComfortPackage(AutoBase p, String t) {
        super(p, t);
        name = p.name + ". Комфортный";
        description = p.description + ". " + this.title + ". Улучшенный интерьер и климат-контроль";
    }

    public double getCost() {
        return autoProperty.getCost() + 10.99;
    }
}
