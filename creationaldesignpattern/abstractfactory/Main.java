package creationaldesignpattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if(os.contains("mac")) {
            factory = new MacOSFactory();
        }
        else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
