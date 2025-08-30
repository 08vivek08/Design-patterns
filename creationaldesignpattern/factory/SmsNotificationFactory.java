package creationaldesignpattern.factory;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNofitication();
    }
}
