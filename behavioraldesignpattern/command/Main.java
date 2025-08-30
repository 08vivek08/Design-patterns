package behavioraldesignpattern.command;

import behavioraldesignpattern.command.commands.AddTextCommand;
import behavioraldesignpattern.command.commands.Command;
import behavioraldesignpattern.command.recievers.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandInvoker invoker = new CommandInvoker();

        Command addHello = new AddTextCommand(editor, "Hello ");
        Command addWorld = new AddTextCommand(editor, "World!");

        invoker.execute(addHello);
        invoker.execute(addWorld);

        System.out.println("After additions: " + editor.getText());

        invoker.undo();
        System.out.println("After undo: " + editor.getText());

        invoker.undo();
        System.out.println("After second undo: " + editor.getText());
    }
}
