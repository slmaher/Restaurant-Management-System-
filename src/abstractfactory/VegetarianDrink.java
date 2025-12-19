package abstractfactory;

/**
 * Vegetarian Drink implementation.
 */
public class VegetarianDrink extends Drink {
    public VegetarianDrink() {
        this.name = "Fresh Juice";
        this.type = "Vegetarian";
        System.out.println("Created: Vegetarian Drink");
    }
}

