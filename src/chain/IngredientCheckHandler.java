package chain;

import order.Order;

/**
 * Handler for checking ingredient availability.
 * Second handler in the chain that verifies ingredients are available.
 */
public class IngredientCheckHandler extends OrderHandler {
    
    @Override
    public void handle(Order order) {
        System.out.println("\n--- IngredientCheckHandler: Processing order " + order.getOrderId() + " ---");
        
        // Simple ingredient check
        boolean ingredientsAvailable = checkIngredients(order);
        
        if (ingredientsAvailable) {
            System.out.println("IngredientCheckHandler: All ingredients are available!");
            System.out.println("IngredientCheckHandler: Kitchen has all required items in stock.");
            passToNext(order);
        } else {
            System.out.println("IngredientCheckHandler: Some ingredients are NOT available!");
            System.out.println("Chain stopped: Order cannot be prepared.");
        }
    }
    
    /**
     * Simple method to check if ingredients are available.
     * In a real system, this would check inventory.
     */
    private boolean checkIngredients(Order order) {
        // Simple check: assume ingredients are available if order has items
        return order.getItems() != null && !order.getItems().isEmpty();
    }
}

