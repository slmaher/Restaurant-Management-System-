package bridge;

/**
 * Payment interface for the Bridge Design Pattern.
 * Separates payment abstraction from implementation.
 */
public interface Payment {
    void pay(double amount);
}

