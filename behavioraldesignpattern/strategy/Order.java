package behavioraldesignpattern.strategy;

import behavioraldesignpattern.strategy.strategies.PayStrategy;

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
