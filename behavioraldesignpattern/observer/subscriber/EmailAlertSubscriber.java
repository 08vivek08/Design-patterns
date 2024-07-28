package behavioraldesignpattern.observer.subscriber;

import behavioraldesignpattern.observer.publisher.StockPublisher;

public class EmailAlertSubscriber implements StockEventSubscriber {
    public StockPublisher publisher;
    public String emailId;

    public EmailAlertSubscriber(StockPublisher publisher, String emailId)
    {
        this.publisher = publisher;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail("product is in stock hurry up");
    }

    public void sendEmail(String message)
    {
        System.out.println("Mail sent to " + emailId + ": "+ message);
    }
}
