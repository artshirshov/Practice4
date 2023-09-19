package template_method_control_work;

public class Program {
    public static void main(String[] args) {
        System.out.println("Процесс короткой стрижки:");
        HaircutTemplate shortHaircut = new ShortHaircut();
        shortHaircut.performHaircut();

        System.out.println("\nПроцесс длинной стрижки:");
        HaircutTemplate longHaircut = new LongHaircut();
        longHaircut.performHaircut();
    }
}
