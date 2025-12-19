package abstractfactory;

/**
 * Factory for creating non-vegetarian meals.
 * Implements the Abstract Factory Design Pattern for non-vegetarian products.
 */
public class NonVegetarianMealFactory implements MealFactory {
    
    public NonVegetarianMealFactory() {
        System.out.println("NonVegetarianMealFactory initialized.");
    }
    
    @Override
    public Burger createBurger() {
        System.out.println("NonVegetarianMealFactory: Creating non-vegetarian burger...");
        return new NonVegetarianBurger();
    }
    
    @Override
    public Pizza createPizza() {
        System.out.println("NonVegetarianMealFactory: Creating non-vegetarian pizza...");
        return new NonVegetarianPizza();
    }
    
    @Override
    public Drink createDrink() {
        System.out.println("NonVegetarianMealFactory: Creating non-vegetarian drink...");
        return new NonVegetarianDrink();
    }
}

