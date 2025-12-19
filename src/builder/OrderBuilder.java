package builder;

import order.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private String orderId;
    private List<String> items;
    private double totalPrice;
    private String paymentMethod;
    
    public OrderBuilder() {
        this.items = new ArrayList<>();
        System.out.println("OrderBuilder initialized. Ready to build an order.");
    }
    
    // Set the order ID
    public OrderBuilder setOrderId(String orderId) {
        this.orderId = orderId;
        System.out.println("Step 1: Order ID set to '" + orderId + "'");
        return this;
    }
    
    // Add a single item to the order
    public OrderBuilder addItem(String item) {
        this.items.add(item);
        System.out.println("Step 2: Added item '" + item + "' to the order");
        return this;
    }
    
    // Set the total price
    public OrderBuilder setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        System.out.println("Step 3: Total price set to $" + totalPrice);
        return this;
    }
    
    // Set the payment method
    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        System.out.println("Step 4: Payment method set to '" + paymentMethod + "'");
        return this;
    }
    
    // Build and return the final Order object
    public Order build() {
        System.out.println("Step 5: Building the Order object...");
        System.out.println("Order construction completed successfully!");
        return new Order(orderId, items, totalPrice, paymentMethod);
    }
}

