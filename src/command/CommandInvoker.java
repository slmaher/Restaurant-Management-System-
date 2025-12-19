package command;

/**
 * Invoker class that executes commands.
 * Manages and executes command pattern operations.
 */
public class CommandInvoker {
    private Command command;
    
    /**
     * Sets the command to be executed.
     */
    public void setCommand(Command command) {
        this.command = command;
        System.out.println("CommandInvoker: Command set and ready to execute.");
    }
    
    /**
     * Executes the current command.
     */
    public void executeCommand() {
        if (command != null) {
            System.out.println("\n--- Command Invoker: Starting execution ---");
            command.execute();
            System.out.println("--- Command Invoker: Execution completed ---\n");
        } else {
            System.out.println("CommandInvoker: No command set to execute.");
        }
    }
}

