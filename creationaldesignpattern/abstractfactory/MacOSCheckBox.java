package creationaldesignpattern.abstractfactory;

public class MacOSCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a MacOS CheckBox");
    }

    @Override
    public void onSelect() {
        System.out.println("MacOS checkbox selected");
    }
}
