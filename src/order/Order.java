package order;

import java.util.List;

/**
 * Represents a customer order with items, price, and payment method.
 */
public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;
    private String paymentMethod;
    
    // Constructor (package-private, used by builder)
    Order(String orderId, List<String> items, double totalPrice, String paymentMethod) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }
    
    // Getters
    public String getOrderId() {
        return orderId;
    }
    
    public List<String> getItems() {
        return items;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    // Display order details
    public void displayOrder() {
        System.out.println("\n=== Order Details ===");
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("===================\n");
    }
}

