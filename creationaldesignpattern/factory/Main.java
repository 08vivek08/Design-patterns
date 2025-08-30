package creationaldesignpattern.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory email = new EmailNotificationFactory();
        email.send("Welcome Email");

        NotificationFactory sms = new SmsNotificationFactory();
        sms.send("SMS service started");
    }
}
