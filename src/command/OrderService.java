package command;

/**
 * Receiver class for order-related operations.
 * Handles order placement and cancellation.
 */
public class OrderService {
    
    public void placeOrder(String orderId) {
        System.out.println("OrderService: Placing order with ID: " + orderId);
        System.out.println("OrderService: Order placed successfully!");
    }
    
    public void cancelOrder(String orderId) {
        System.out.println("OrderService: Cancelling order with ID: " + orderId);
        System.out.println("OrderService: Order cancelled successfully!");
    }
}

