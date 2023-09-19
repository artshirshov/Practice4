package decorator;

public class Renault extends AutoBase {
    public Renault(String name, String info, double costBase) {
        this.name = name;
        this.description = info;
        this.costBase = costBase;
    }

    public double getCost() {
        return costBase * 1.18;
    }
}
