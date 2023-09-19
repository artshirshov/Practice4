package decorator;

public class MediaNAV extends DecoratorOptions {
    public MediaNAV(AutoBase p, String t) {
        super(p, t);
        name = p.name + ". Современный";
        description = p.description + ". " + this.title + ". Обновленная мультимедийная навигационная система";
    }

    public double getCost() {
        return autoProperty.getCost() + 15.99;
    }
}
