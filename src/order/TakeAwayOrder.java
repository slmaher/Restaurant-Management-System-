package order;

/**
 * Represents a take-away order type.
 * Implements OrderType interface for customers taking food to go.
 */
public class TakeAwayOrder implements OrderType {
    
    public TakeAwayOrder() {
        System.out.println("Creating a Take-Away Order...");
    }
    
    @Override
    public void processOrder() {
        System.out.println("Processing Take-Away Order: Preparing for pickup.");
    }
    
    @Override
    public String getOrderType() {
        return "Take-Away";
    }
}

