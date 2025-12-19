package abstractfactory;

/**
 * Vegetarian Burger implementation.
 */
public class VegetarianBurger extends Burger {
    public VegetarianBurger() {
        this.name = "Veggie Burger";
        this.type = "Vegetarian";
        System.out.println("Created: Vegetarian Burger");
    }
}

