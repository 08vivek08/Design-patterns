import Strategies.PayStrategy;

public class Order {
    private PayStrategy strategy;

    Order(PayStrategy strategy)
    {
        this.strategy = strategy;
    }

    void collectPaymentDetails()
    {
        strategy.collectPaymentDetails();
    }
}
