package Observer.Publisher;

import java.util.ArrayList;
import java.util.List;

import Observer.Subscriber.StockEventSubscriber;

public class IphoneStockPublisher implements StockPublisher {
    private int stockCount = 0;
    private List<StockEventSubscriber> eventListeners = new ArrayList<>();

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void notifySubscribers() {
        for (StockEventSubscriber eventListener : eventListeners) {
            eventListener.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(stockCount < 0) return ;
        if(this.stockCount == 0)
        {
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public void subscribe(StockEventSubscriber listener) {
        eventListeners.add(listener);
    }

    @Override
    public void unsubscribe(StockEventSubscriber listener) {
        eventListeners.remove(listener);
    }
}
