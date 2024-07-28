package structuraldesignpattern.decorator;

public class FarmHouse implements BasePizza {

    @Override
    public int cost() {
        return 200;
    }

}
