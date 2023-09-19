package abstract_factory;

public class AudiFactory extends CarFactory{

    @Override
    public AbstractCar createCar() {
        return new AudiCar("Ауди");
    }

    @Override
    public AbstractEngine createEngine() {
        return new AudiEngine();
    }

    @Override
    public AbstractBodyType createBodyType() {
        return new AudiBodyType();
    }
}
