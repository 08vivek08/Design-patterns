package creationaldesignpattern.singleton;

/*
* Bill Pugh Singleton
* Best mix of lazy + thread-safety without synchronization
*/
public class PaymentGatewayManager {
    // Private constructor to prevent instantiation
    private PaymentGatewayManager() {
        Logger.INSTANCE.log("Lazy Initialization of Payment Gateway Manager");
    }

    // Static inner class that holds the instance
    private static class SingletonInstanceHelper {
        private static final PaymentGatewayManager Instance = new PaymentGatewayManager();
    }

    // Public static method to get the instance without the class object
    public static PaymentGatewayManager getInstance() {
        return SingletonInstanceHelper.Instance;
    }

    public void processPayment(double amount) {
        // could add payment gateway logic here
        Logger.INSTANCE.log("Processing payment of $" + amount + " through the payment gateway.");
    }
}
