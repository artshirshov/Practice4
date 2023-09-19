package abstract_factory;

public class FordCar extends AbstractCar{
    public FordCar(String name)
    {
        this.name = name;
    }
    @Override
    public int maxSpeed(AbstractEngine engine) {
        return engine.maxSpeed;
    }

    @Override
    public String bodyType(AbstractBodyType bodyType) {
        return bodyType.bodyType;
    }

    @Override
    public String toString() {
        return "FordCar{" +
                "Name='" + name + '\'' +
                '}';
    }
}
