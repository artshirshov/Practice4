package factory_method;

public class ShipTransCom extends TransportCompany {
    public ShipTransCom(String name) {
        super(name);
    }

    @Override
    public TransportService create(String n, int t) {
        return new Shipping(getName(), t);
    }
}
