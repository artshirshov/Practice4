package facade;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private String messageFin;
    private List<NotificationListener> listeners = new ArrayList<>();

    public void addNotificationListener(NotificationListener listener) {
        listeners.add(listener);
    }

    public void removeNotificationListener(NotificationListener listener) {
        listeners.remove(listener);
    }

    public String getMessageFin() {
        return messageFin;
    }

    public void setMessageFin(String messageFin) {
        this.messageFin = messageFin;
        notifyListeners();
    }

    private void notifyListeners() {
        for (NotificationListener listener : listeners) {
            listener.notificationChanged(this);
        }
    }
}

