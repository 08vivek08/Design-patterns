package behavioraldesignpattern.observer.subscriber;

import behavioraldesignpattern.observer.publisher.StockPublisher;

public class MobileAlertSubscriber implements StockEventSubscriber {

    public StockPublisher publisher;
    public String userMobile;

    public MobileAlertSubscriber(StockPublisher publisher, String userMobile)
    {
        this.publisher = publisher;
        this.userMobile = userMobile;
    }

    @Override
    public void update() {
        sendMessage("product is in stock hurry up");
    }

    public void sendMessage(String message)
    {
        System.out.println("Message sent to " + userMobile +" " + message);
    }
}
