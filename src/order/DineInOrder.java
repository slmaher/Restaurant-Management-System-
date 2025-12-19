package order;

/**
 * Represents a dine-in order type.
 * Implements OrderType interface for customers dining at the restaurant.
 */
public class DineInOrder implements OrderType {
    
    public DineInOrder() {
        System.out.println("Creating a Dine-In Order...");
    }
    
    @Override
    public void processOrder() {
        System.out.println("Processing Dine-In Order: Preparing table service.");
    }
    
    @Override
    public String getOrderType() {
        return "Dine-In";
    }
}

