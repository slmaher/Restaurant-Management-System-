package command;

/**
 * Receiver class for kitchen operations.
 * Handles order preparation.
 */
public class Kitchen {
    
    public void prepareOrder(String orderId) {
        System.out.println("Kitchen: Preparing order with ID: " + orderId);
        System.out.println("Kitchen: Cooking in progress...");
        System.out.println("Kitchen: Order preparation completed!");
    }
}

