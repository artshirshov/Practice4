package facade;

public class Program {
    public static void main(String[] args) {
        Drive drive = new Drive();
        Power power = new Power();
        Notification notification = new Notification();
        Microwave microwave = new Microwave(drive, power, notification);

        System.out.println("Разморозка");
        microwave.defrost();

        System.out.println("Приготовление продукта");
        microwave.cook();
    }

}
