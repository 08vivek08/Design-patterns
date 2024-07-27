package Observer;

import Observer.Publisher.*;
import Observer.Subscriber.*;

public class Main {
    public static void main(String[] args) {
        StockPublisher iPhoneStockPublisher = new IphoneStockPublisher();
        StockEventSubscriber observer1 = new EmailAlertSubscriber(iPhoneStockPublisher, "xyz@gmail.com");
        StockEventSubscriber observer2 = new MobileAlertSubscriber(iPhoneStockPublisher, "1722723383");
        StockEventSubscriber observer3 = new EmailAlertSubscriber(iPhoneStockPublisher, "abc@gmail.com");

        iPhoneStockPublisher.subscribe(observer1);
        iPhoneStockPublisher.setStockCount(12);
        iPhoneStockPublisher.subscribe(observer2);
        iPhoneStockPublisher.setStockCount(10);
        iPhoneStockPublisher.setStockCount(0);
        iPhoneStockPublisher.subscribe(observer3);
        iPhoneStockPublisher.setStockCount(10);

    }
}
