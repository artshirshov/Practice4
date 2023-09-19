package template_method_control_work;

public class ShortHaircut extends HaircutTemplate{

    @Override
    protected void prepareClient() {
        System.out.println("Предложение напитка и установка в кресле для короткой стрижки");
    }

    @Override
    protected void consultClient() {
        System.out.println("Консультация с клиентом для короткой стрижки");
    }

    @Override
    protected void cutHair() {
        System.out.println("Стрижка коротких волос");
    }
}
