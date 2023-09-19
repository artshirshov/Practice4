package abstract_factory;

public class BMWCar extends AbstractCar {

    public BMWCar(String name) {
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
        return "BMWCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
