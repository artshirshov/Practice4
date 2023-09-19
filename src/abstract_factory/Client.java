package abstract_factory;

public class Client{
    private final AbstractCar abstractCar;
    private final AbstractEngine abstractEngine;
    private final AbstractBodyType abstractBodyType;
    public Client(CarFactory carFactory){
        this.abstractCar = carFactory.createCar();
        this.abstractEngine = carFactory.createEngine();
        this.abstractBodyType = carFactory.createBodyType();
    }

    public int runMaxSpeed(){
        return abstractCar.maxSpeed(abstractEngine);
    }
    public String getBodyType(){return abstractCar.bodyType(abstractBodyType);}

    @Override
    public String toString(){
        return abstractCar.toString();
    }
}
