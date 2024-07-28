package behavioraldesignpattern.strategy;

import behavioraldesignpattern.strategy.strategies.PayByCreditCard;

public class OrderByCreditCard extends Order {

    OrderByCreditCard() {
        super(new PayByCreditCard());
    }

}
