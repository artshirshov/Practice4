package facade;

import java.util.ArrayList;
import java.util.List;

public class Drive {
    private String twist;
    private List<DriveListener> listeners = new ArrayList<>();

    public Drive() {
        twist = "исходная позиция";
    }

    public void addDriveListener(DriveListener listener) {
        listeners.add(listener);
    }

    public void removeDriveListener(DriveListener listener) {
        listeners.remove(listener);
    }

    public String getTwist() {
        return twist;
    }

    public void turnLeft() {
        twist = "Поворот налево";
        notifyListeners();
    }

    public void turnRight() {
        twist = "Поворот направо";
        notifyListeners();
    }

    public void stop() {
        twist = "Стоп";
        notifyListeners();
    }

    private void notifyListeners() {
        for (DriveListener listener : listeners) {
            listener.driveTwisted(this);
        }
    }

    @Override
    public String toString() {
        return "Положение привода: " + twist;
    }
}

