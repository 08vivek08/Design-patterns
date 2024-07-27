import Strategies.PayByUpi;

public class OrderByUpi extends Order {

    OrderByUpi() {
        super(new PayByUpi());
    }
}
