package chain;

import order.Order;

/**
 * Abstract handler for the Chain of Responsibility pattern.
 * Defines the chain structure for order processing.
 */
public abstract class OrderHandler {
    protected OrderHandler nextHandler;
    
    /**
     * Sets the next handler in the chain.
     */
    public void setNext(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    /**
     * Processes the order and passes it to the next handler.
     * Subclasses must implement this method.
     */
    public abstract void handle(Order order);
    
    /**
     * Passes the order to the next handler in the chain.
     */
    protected void passToNext(Order order) {
        if (nextHandler != null) {
            nextHandler.handle(order);
        } else {
            System.out.println("Chain completed: Order processed successfully through all handlers!");
        }
    }
}
