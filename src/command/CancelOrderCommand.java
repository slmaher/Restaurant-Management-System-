package command;

/**
 * Command for cancelling an order.
 * Implements the Command pattern for order cancellation.
 */
public class CancelOrderCommand implements Command {
    private OrderService orderService;
    private String orderId;
    
    public CancelOrderCommand(OrderService orderService, String orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }
    
    @Override
    public void execute() {
        System.out.println("CancelOrderCommand: Executing cancel order command...");
        orderService.cancelOrder(orderId);
        System.out.println("CancelOrderCommand: Command executed successfully!");
    }
}

