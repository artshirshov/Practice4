package factory_method;

public class TaxiServices extends TransportService{
    public int category;

    public TaxiServices(String name, int category) {
        super(name);
        this.category = category;
    }
    @Override
    public double costTransportation(double distance) {
        return distance * category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return String.format("Фирма %s, поездка категории %d", getName(), category);
    }
}
