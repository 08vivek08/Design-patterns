package behavioraldesignpattern.strategy;

public class Main {
    public static void main(String[] args) {
        Order orderByUpi = new OrderByUpi();
        orderByUpi.collectPaymentDetails();

        Order orderByCreditCard = new OrderByCreditCard();
        orderByCreditCard.collectPaymentDetails();
    }
}
