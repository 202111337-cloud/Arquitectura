package service;

/*
 * Invoker del patrón Command.
 */
public class CommandExecutor {
    public void executeCommand(Command command) {
        command.execute();
    }
}
