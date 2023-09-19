package strategy;

public class InsertionSort extends StrategySort{

    public InsertionSort()
    {
        title = "Сортировка вставками";
    }
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int buffer = array[i];
            for (j = i - 1; j >= 0; j--)
            {
                if (array[j] < buffer)
                    break;
                array[j + 1] = array[j];
            }
            array[j + 1] = buffer;
        }
    }

    @Override
    public String toString() {
        return title;
    }
}
