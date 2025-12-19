package chain;

import order.Order;

/**
 * Handler for validating orders.
 * First handler in the chain that checks if order is valid.
 */
public class OrderValidationHandler extends OrderHandler {
    
    @Override
    public void handle(Order order) {
        System.out.println("\n--- OrderValidationHandler: Processing order " + order.getOrderId() + " ---");
        
        // Simple validation check
        if (order.getOrderId() != null && !order.getOrderId().isEmpty() && 
            order.getItems() != null && !order.getItems().isEmpty() && 
            order.getTotalPrice() > 0) {
            System.out.println("OrderValidationHandler: Order validation passed!");
            System.out.println("OrderValidationHandler: Order ID is valid, items exist, and price is positive.");
            passToNext(order);
        } else {
            System.out.println("OrderValidationHandler: Order validation FAILED!");
            System.out.println("OrderValidationHandler: Order is missing required information.");
            System.out.println("Chain stopped: Order cannot proceed.");
        }
    }
}

