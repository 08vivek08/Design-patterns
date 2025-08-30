package creationaldesignpattern.abstractfactory;

public class WindowsCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Painting a windows checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Windows checkbox selected");
    }
}
