package strategy;

abstract public class StrategySort {
    public String title;
    public abstract void sort(int[] array);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
