package strategy;

public class Context {
    private StrategySort strategy;
    private int[] array;

    public Context(StrategySort strategy, int[] array) {
        this.strategy = strategy;
        this.array = array;
    }

    public void sort() {
        strategy.sort(array);
    }

    public void printArray() {
        System.out.println(strategy.toString());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
