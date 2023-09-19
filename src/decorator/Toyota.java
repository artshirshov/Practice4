package decorator;

public class Toyota extends AutoBase {
    public Toyota(String name, String info, double costBase) {
        this.name = name;
        this.description = info;
        this.costBase = costBase;
    }

    public double getCost() {
        return costBase * 1.15; // Допустим, цена на Toyota с наценкой 15%
    }
}
