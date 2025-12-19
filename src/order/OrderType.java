package order;

/**
 * Interface for different types of orders.
 * Defines the contract that all order types must implement.
 */
public interface OrderType {
    void processOrder();
    String getOrderType();
}

