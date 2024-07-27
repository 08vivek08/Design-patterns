package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObj.log(LogProcessor.ERROR, "exception happens");
        logObj.log(LogProcessor.DEBUG, "need to debug");
        logObj.log(LogProcessor.INFO, "just for info");
    }
}
