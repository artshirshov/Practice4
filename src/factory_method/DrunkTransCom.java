package factory_method;

public class DrunkTransCom extends TransportCompany{
    public DrunkTransCom(String name) {
        super(name);
    }

    @Override
    public TransportService create(String n, int t) {
        return new Shipping(getName(), t);
    }
}
