package abstractfactory;

/**
 * Non-Vegetarian Drink implementation.
 */
public class NonVegetarianDrink extends Drink {
    public NonVegetarianDrink() {
        this.name = "Soft Drink";
        this.type = "Non-Vegetarian";
        System.out.println("Created: Non-Vegetarian Drink");
    }
}

