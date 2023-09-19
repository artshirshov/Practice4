package abstract_factory;

public class FordFactory extends CarFactory{

    @Override
    public AbstractCar createCar() {
        return new FordCar("Форд"); // Предположим, что у вас есть класс FordCar, который принимает имя в конструкторе.
    }

    @Override
    public AbstractEngine createEngine() {
        return new FordEngine();
    }

    @Override
    public AbstractBodyType createBodyType() {
        return new FordBodyType();
    }
}
