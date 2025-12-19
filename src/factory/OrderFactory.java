package factory;

import order.OrderType;

/**
 * Factory interface for creating different types of orders.
 * Defines the contract that all order factories must implement.
 */
public interface OrderFactory {
    OrderType createOrder();
}

