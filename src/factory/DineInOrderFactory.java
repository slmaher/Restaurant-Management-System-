package factory;

import order.DineInOrder;
import order.OrderType;

/**
 * Factory for creating Dine-In orders.
 * Implements the Factory Design Pattern for Dine-In order creation.
 */
public class DineInOrderFactory implements OrderFactory {
    
    @Override
    public OrderType createOrder() {
        System.out.println("DineInOrderFactory: Creating a new Dine-In Order...");
        OrderType order = new DineInOrder();
        System.out.println("DineInOrderFactory: Dine-In Order created successfully!");
        return order;
    }
}

