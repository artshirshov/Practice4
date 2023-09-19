package strategy;

public class BubbleSort extends StrategySort{
    public BubbleSort() {
        title = "Пузырьковая сортировка";
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    @Override
    public String toString() {
        return title;
    }
}
