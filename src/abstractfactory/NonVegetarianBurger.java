package abstractfactory;

/**
 * Non-Vegetarian Burger implementation.
 */
public class NonVegetarianBurger extends Burger {
    public NonVegetarianBurger() {
        this.name = "Chicken Burger";
        this.type = "Non-Vegetarian";
        System.out.println("Created: Non-Vegetarian Burger");
    }
}

