package factory;

import order.OrderType;
import order.TakeAwayOrder;

/**
 * Factory for creating Take-Away orders.
 * Implements the Factory Design Pattern for Take-Away order creation.
 */
public class TakeAwayOrderFactory implements OrderFactory {
    
    @Override
    public OrderType createOrder() {
        System.out.println("TakeAwayOrderFactory: Creating a new Take-Away Order...");
        OrderType order = new TakeAwayOrder();
        System.out.println("TakeAwayOrderFactory: Take-Away Order created successfully!");
        return order;
    }
}

