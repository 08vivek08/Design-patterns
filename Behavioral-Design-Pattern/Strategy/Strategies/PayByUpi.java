package Strategies;

public class PayByUpi implements PayStrategy{

    @Override
    public void collectPaymentDetails() {
        System.out.println("Algorithm to collect payment using UPI");
    }
}