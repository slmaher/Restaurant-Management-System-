package order;

import bridge.Payment;
import java.util.List;

/**
 * Represents a customer order with items, price, and payment method.
 * Uses Bridge Design Pattern to separate payment from order.
 */
public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;
    private Payment payment; // Bridge pattern: Order uses Payment abstraction
    
    // Constructor (package-private, used by builder)
    Order(String orderId, List<String> items, double totalPrice, Payment payment) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.payment = payment;
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
    
    public Payment getPayment() {
        return payment;
    }
    
    // Set payment method (allows changing payment method dynamically)
    public void setPayment(Payment payment) {
        this.payment = payment;
        System.out.println("Payment method changed for Order: " + orderId);
    }
    
    // Process payment using Bridge pattern
    public void processPayment() {
        System.out.println("\nProcessing payment for Order: " + orderId);
        System.out.println("Total amount: $" + totalPrice);
        payment.pay(totalPrice);
    }
    
    // Display order details
    public void displayOrder() {
        System.out.println("\n=== Order Details ===");
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Payment Type: " + payment.getClass().getSimpleName());
        System.out.println("===================\n");
    }
}

