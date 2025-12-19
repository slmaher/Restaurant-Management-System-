package abstractfactory;

/**
 * Factory for creating vegetarian meals.
 * Implements the Abstract Factory Design Pattern for vegetarian products.
 */
public class VegetarianMealFactory implements MealFactory {
    
    public VegetarianMealFactory() {
        System.out.println("VegetarianMealFactory initialized.");
    }
    
    @Override
    public Burger createBurger() {
        System.out.println("VegetarianMealFactory: Creating vegetarian burger...");
        return new VegetarianBurger();
    }
    
    @Override
    public Pizza createPizza() {
        System.out.println("VegetarianMealFactory: Creating vegetarian pizza...");
        return new VegetarianPizza();
    }
    
    @Override
    public Drink createDrink() {
        System.out.println("VegetarianMealFactory: Creating vegetarian drink...");
        return new VegetarianDrink();
    }
}

