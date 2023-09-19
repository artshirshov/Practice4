package abstract_factory;

public class Program {
    public static void main(String[] args) {
        CarFactory fordCar = new FordFactory();
        Client clientFord = new Client(fordCar);
        System.out.printf("Максимальная скорость %s составляет %d км/час в кузове %s\n", clientFord, clientFord.runMaxSpeed(), clientFord.getBodyType());

        CarFactory audiCar = new AudiFactory();
        Client clientAudi = new Client(audiCar);
        System.out.printf("Максимальная скорость %s составляет %d км/час в кузове %s\n", clientAudi, clientAudi.runMaxSpeed(), clientAudi.getBodyType());

        CarFactory bmwCar = BMWFactorySingleton.getInstance();
        Client clientBMW = new Client(bmwCar);
        System.out.printf("Максимальная скорость %s составляет %d км/час в кузове %s\n", clientBMW, clientBMW.runMaxSpeed(), clientBMW.getBodyType());
    }
}
