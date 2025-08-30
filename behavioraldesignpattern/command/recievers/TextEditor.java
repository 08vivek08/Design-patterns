package behavioraldesignpattern.command.recievers;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
    }

    public void removeText(int length) {
        text.delete(text.length()-length, text.length());
    }

    public String getText() {
        return text.toString();
    }
}
