package factory_method;

public class TaxiTransCom extends TransportCompany {
    public TaxiTransCom(String name) {
        super(name);
    }

    @Override
    public TransportService create(String n, int c) {
        return new TaxiServices(getName(), c);
    }
}
