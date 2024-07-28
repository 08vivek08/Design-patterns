package behavioraldesignpattern.strategy;

import behavioraldesignpattern.strategy.strategies.PayByUpi;

public class OrderByUpi extends Order {

    OrderByUpi() {
        super(new PayByUpi());
    }
}
