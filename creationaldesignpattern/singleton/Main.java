package creationaldesignpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.INSTANCE;

        // Attempt to create another instance (should return the existing instance)
        Logger anotherLogger = Logger.INSTANCE;

        // Check if both instances are the same.
        if(logger == anotherLogger) {
            logger.log("Both instances are the same. Enum Singleton pattern is working.");
        }
        else {
            anotherLogger.log("Singleton pattern is not working correctly.");
        }

        PaymentGatewayManager paymentGateway = PaymentGatewayManager.getInstance();

        // Attempt to create another instance (should return the existing instance)
        PaymentGatewayManager anotherPaymentGateway = PaymentGatewayManager.getInstance();

        // Check if both instances are the same.
        if (paymentGateway == anotherPaymentGateway) {
            logger.log("Both instances are the same. Bill Pugh Singleton pattern is working.");
        }
        else {
            logger.log("Singleton pattern is not working correctly.");
        }

        paymentGateway.processPayment(100);
    }
}
