package abstract_factory;

public class AudiCar extends AbstractCar{

    public AudiCar(String name){
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
        return "AudiCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
