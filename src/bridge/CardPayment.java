package bridge;

/**
 * Card payment implementation.
 * Implements the Payment interface for card transactions.
 */
public class CardPayment implements Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println("Processing card payment of $" + amount);
        System.out.println("Card payment completed successfully!");
    }
}

