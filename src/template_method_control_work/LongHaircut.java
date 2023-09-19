package template_method_control_work;

public class LongHaircut extends HaircutTemplate{
    @Override
    protected void prepareClient() {
        System.out.println("Предложение напитка и установка в кресле для длинной стрижки");
    }

    @Override
    protected void consultClient() {
        System.out.println("Консультация с клиентом для длинной стрижки");
    }

    @Override
    protected void cutHair() {
        System.out.println("Стрижка длинных волос");
    }
}
