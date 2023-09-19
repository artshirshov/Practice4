package template_method_control_work;

public abstract class HaircutTemplate {
    public final void performHaircut() {
        prepareClient();
        consultClient();
        prepareHair();
        cutHair();
        finishHaircut();
        sayGoodbye();
    }
    protected abstract void prepareClient();

    protected abstract void consultClient();

    protected void prepareHair() {
        System.out.println("Мытье и сушка волос");
    }

    protected abstract void cutHair();

    protected void finishHaircut() {
        System.out.println("Укладка волос и нанесение продуктов");
    }

    protected void sayGoodbye() {
        System.out.println("До свидания!");
    }
}
