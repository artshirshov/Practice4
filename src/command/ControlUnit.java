package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ControlUnit {
    private List<Command> commands = new ArrayList<>();
    private int current = 0;
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void storeCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        if (current < commands.size()) {
            Command command = commands.get(current);
            command.execute();
            undoStack.push(command);
            current++;
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.unExecute();
            redoStack.push(command);
            current--;
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
            current++;
        }
    }

    public void redoAll() {
        while (!redoStack.isEmpty()) {
            redo();
        }
    }
}
