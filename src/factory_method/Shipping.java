package factory_method;

public class Shipping extends TransportService {
    private double tariff;

    public Shipping(String name, double tariff) {
        super(name);
        this.tariff = tariff;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    @Override
    public double costTransportation(double distance) {
        return distance * tariff;
    }

    @Override
    public String toString() {
        return String.format("Фирма %s, доставка по тарифу %.2f", getName(), tariff);
    }
}

