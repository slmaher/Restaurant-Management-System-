package abstractfactory;

/**
 * Vegetarian Pizza implementation.
 */
public class VegetarianPizza extends Pizza {
    public VegetarianPizza() {
        this.name = "Veggie Pizza";
        this.type = "Vegetarian";
        System.out.println("Created: Vegetarian Pizza");
    }
}

