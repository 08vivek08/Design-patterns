public class ExtraMushroom extends ToppingsDecorator {
    BasePizza basePizza;
    ExtraMushroom(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
