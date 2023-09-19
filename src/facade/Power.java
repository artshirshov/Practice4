package facade;

import java.util.ArrayList;
import java.util.List;

public class Power {
    private int microwavePower;
    private List<PowerListener> listeners = new ArrayList<>();

    public void addPowerListener(PowerListener listener) {
        listeners.add(listener);
    }

    public void removePowerListener(PowerListener listener) {
        listeners.remove(listener);
    }

    public int getMicrowavePower() {
        return microwavePower;
    }

    public void setMicrowavePower(int microwavePower) {
        this.microwavePower = microwavePower;
        notifyListeners();
    }

    private void notifyListeners() {
        for (PowerListener listener : listeners) {
            listener.powerChanged(this);
        }
    }
    @Override
    public String toString() {
        return "Мощность: " + microwavePower + "W";
    }
}

