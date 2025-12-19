package command;

/**
 * Command for placing an order.
 * Implements the Command pattern for order placement.
 */
public class PlaceOrderCommand implements Command {
    private OrderService orderService;
    private String orderId;
    
    public PlaceOrderCommand(OrderService orderService, String orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }
    
    @Override
    public void execute() {
        System.out.println("PlaceOrderCommand: Executing place order command...");
        orderService.placeOrder(orderId);
        System.out.println("PlaceOrderCommand: Command executed successfully!");
    }
}

