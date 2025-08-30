package creationaldesignpattern.singleton;

/*
* Enum Singleton
* Best choice overall, unless you need lazy init
*/
public enum Logger {
    INSTANCE;

    public void log(String message) {
        System.out.println(message);
        // could add logic to save in log file
    }
}
