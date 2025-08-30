package creationaldesignpattern.factory;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void send(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
