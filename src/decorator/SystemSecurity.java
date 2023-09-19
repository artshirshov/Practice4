package decorator;

public class SystemSecurity extends DecoratorOptions {
    public SystemSecurity(AutoBase p, String t) {
        super(p, t);
        name = p.name + ". Повышенной безопасности";
        description = p.description + ". " + this.title + ". Передние боковые подушки безопасности, ESP - система динамической стабилизации автомобиля";
    }

    public double getCost() {
        return autoProperty.getCost() + 20.99;
    }
}
