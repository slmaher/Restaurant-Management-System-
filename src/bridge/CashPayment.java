package bridge;

/**
 * Cash payment implementation.
 * Implements the Payment interface for cash transactions.
 */
public class CashPayment implements Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println("Processing cash payment of $" + amount);
        System.out.println("Cash payment completed successfully!");
    }
}

