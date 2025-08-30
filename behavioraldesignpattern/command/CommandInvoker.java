package behavioraldesignpattern.command;

import behavioraldesignpattern.command.commands.Command;

import java.util.Stack;

public class CommandInvoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void execute(@org.jetbrains.annotations.NotNull Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if(!commandHistory.empty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
