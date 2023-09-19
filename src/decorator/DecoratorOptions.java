package decorator;

public abstract class DecoratorOptions extends AutoBase {
    protected AutoBase autoProperty;
    protected String title;

    public DecoratorOptions(AutoBase au, String tit) {
        this.autoProperty = au;
        this.title = tit;
    }
}
