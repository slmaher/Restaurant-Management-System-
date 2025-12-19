package command;

/**
 * Command for preparing an order.
 * Implements the Command pattern for order preparation.
 */
public class PrepareOrderCommand implements Command {
    private Kitchen kitchen;
    private String orderId;
    
    public PrepareOrderCommand(Kitchen kitchen, String orderId) {
        this.kitchen = kitchen;
        this.orderId = orderId;
    }
    
    @Override
    public void execute() {
        System.out.println("PrepareOrderCommand: Executing prepare order command...");
        kitchen.prepareOrder(orderId);
        System.out.println("PrepareOrderCommand: Command executed successfully!");
    }
}

