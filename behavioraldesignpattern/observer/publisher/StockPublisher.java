package behavioraldesignpattern.observer.publisher;

import behavioraldesignpattern.observer.subscriber.StockEventSubscriber;

public interface StockPublisher {
    public void subscribe(StockEventSubscriber listener);
    public void unsubscribe(StockEventSubscriber listener);
    public void notifySubscribers();

    public void setStockCount(int stockCount);
    public int getStockCount();
}
