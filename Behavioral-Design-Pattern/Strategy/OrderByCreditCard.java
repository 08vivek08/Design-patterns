import Strategies.PayByCreditCard;

public class OrderByCreditCard extends Order {

    OrderByCreditCard() {
        super(new PayByCreditCard());
    }

}
