package Strategies;

public class PayByCreditCard implements PayStrategy {

    @Override
    public void collectPaymentDetails() {
        System.out.println("Algorithm to collect payment using Credit Card");
    }
}
