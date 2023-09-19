package factory_method;

abstract public class TransportCompany {
    public String name;

    public TransportCompany(String name) {
        this.name = name;
    }

    abstract public TransportService create(String name, int k);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TransportCompany{" +
                "name='" + name + '\'' +
                '}';
    }
}
