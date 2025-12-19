package chain;

import order.Order;

/**
 * Handler for approving payment.
 * Final handler in the chain that verifies payment can be processed.
 */
public class PaymentApprovalHandler extends OrderHandler {
    
    @Override
    public void handle(Order order) {
        System.out.println("\n--- PaymentApprovalHandler: Processing order " + order.getOrderId() + " ---");
        
        // Simple payment approval check
        if (order.getPayment() != null && order.getTotalPrice() > 0) {
            System.out.println("PaymentApprovalHandler: Payment method is valid!");
            System.out.println("PaymentApprovalHandler: Payment approved for amount: $" + order.getTotalPrice());
            System.out.println("PaymentApprovalHandler: Order is ready to be processed!");
            passToNext(order);
        } else {
            System.out.println("PaymentApprovalHandler: Payment approval FAILED!");
            System.out.println("PaymentApprovalHandler: Invalid payment method or amount.");
            System.out.println("Chain stopped: Payment cannot be processed.");
        }
    }
}

