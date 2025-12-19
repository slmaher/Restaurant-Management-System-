package abstractfactory;

/**
 * Abstract Factory interface for creating meal products.
 * Defines methods to create Burger, Pizza, and Drink.
 */
public interface MealFactory {
    Burger createBurger();
    Pizza createPizza();
    Drink createDrink();
}

