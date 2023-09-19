package abstract_factory;

abstract public class CarFactory {
    public abstract AbstractCar createCar();
    public abstract AbstractEngine createEngine();
    public abstract AbstractBodyType createBodyType();
}
