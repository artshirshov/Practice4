package abstract_factory;

public class BMWFactorySingleton extends CarFactory {
    // Приватное статическое поле для хранения единственного экземпляра фабрики
    private static BMWFactorySingleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров фабрики извне
    private BMWFactorySingleton() {
    }

    // Метод для получения единственного экземпляра фабрики
    public static BMWFactorySingleton getInstance() {
        if (instance == null) {
            instance = new BMWFactorySingleton();
        }
        return instance;
    }

    @Override
    public AbstractCar createCar() {
        return new BMWCar("БМВ");
    }

    @Override
    public AbstractEngine createEngine() {
        return new BMWEngine();
    }

    @Override
    public AbstractBodyType createBodyType() {
        return new BMWBodyType();
    }
}
