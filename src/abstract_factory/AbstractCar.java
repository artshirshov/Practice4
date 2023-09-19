package abstract_factory;

abstract public class AbstractCar {
    public String name;
    public abstract int maxSpeed(AbstractEngine engine);
    public abstract String bodyType(AbstractBodyType bodyType);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
