package factory_method;

public class Program {
    public static void main(String[] args) {
        TransportCompany trCom = new TaxiTransCom("Служба такси");
        TransportService compService = trCom.create("Такси", 1);
        double dist = 15.5;
        print(compService, dist);

        TransportCompany gCom = new ShipTransCom("Служба перевозок");
        compService = gCom.create("Грузоперевозки", 2);
        double distg = 150.5;
        print(compService, distg);

        TransportCompany dCom = new DrunkTransCom("Служба личных водителей");
        compService = dCom.create("Трезвый водитель", 1);
        double distd = 50.5;
        print(compService, distd);
    }
    private static void print(TransportService compTax, double distg) {
        System.out.printf("Компания %s, расстояние %.2f, стоимость: %.2f%n",
                compTax.toString(), distg, compTax.costTransportation(distg));
    }
}
