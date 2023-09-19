package decorator;

public class SportPackage extends DecoratorOptions {
    public SportPackage(AutoBase p, String t) {
        super(p, t);
        name = p.name + ". Спортивный";
        description = p.description + ". " + this.title + ". Улучшенная подвеска и спортивный дизайн";
    }

    public double getCost() {
        return autoProperty.getCost() + 12.99;
    }
}
