public class Main {
    public static void main(String[] args) {
        BasePizza mushroom_cheese_FarmHouse = new ExtraMushroom(new ExtraCheese(new FarmHouse()));
        System.out.println("mushroom_cheese_FarmHouse cost: " + mushroom_cheese_FarmHouse.cost());
    }
}
