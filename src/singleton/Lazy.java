package singleton;

import java.util.function.Supplier;

public class Lazy<T> {
    private final Supplier<T> supplier;
    private T value;
    private boolean isValueCreated = false;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        if (!isValueCreated) {
            value = supplier.get();
            isValueCreated = true;
        }
        return value;
    }
}
