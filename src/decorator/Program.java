package decorator;

public class Program {
    public static void main(String[] args) {
        Renault reno = new Renault("Рено", "Renault LOGAN Active", 499.0);
        print(reno);

        AutoBase myReno = new MediaNAV(reno, "Навигация");
        print(myReno);

        AutoBase newMyReno = new SystemSecurity(new MediaNAV(reno, "Навигация"), "Безопасность");
        print(newMyReno);

        // Создаем новый автомобиль Toyota
        Toyota toyota = new Toyota("Тойота", "Toyota Corolla", 599.0);
        print(toyota);

        // Добавляем пакет комфорта к Toyota
        AutoBase comfortToyota = new ComfortPackage(toyota, "Комфорт");
        print(comfortToyota);

        // Добавляем пакет спорта к Toyota
        AutoBase sportToyota = new SportPackage(toyota, "Спорт");
        print(sportToyota);
    }

    private static void print(AutoBase av) {
        System.out.println(av.toString());
    }
}
