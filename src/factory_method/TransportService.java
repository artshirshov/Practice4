package factory_method;

abstract public class TransportService {
    public String name;

    public TransportService(String name) {
        this.name = name;
    }

    abstract public double costTransportation(double distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
