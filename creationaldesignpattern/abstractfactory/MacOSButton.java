package creationaldesignpattern.abstractfactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting mac-os button");
    }

    @Override
    public void onClick() {
        System.out.println("MacOS button clicked");
    }
}
