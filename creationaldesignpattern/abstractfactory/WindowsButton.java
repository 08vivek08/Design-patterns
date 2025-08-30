package creationaldesignpattern.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting a windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
