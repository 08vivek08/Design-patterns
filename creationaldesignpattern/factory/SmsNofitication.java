package creationaldesignpattern.factory;

public class SmsNofitication implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+ message);
    }
}
