package abstractfactory;

/**
 * Non-Vegetarian Pizza implementation.
 */
public class NonVegetarianPizza extends Pizza {
    public NonVegetarianPizza() {
        this.name = "Pepperoni Pizza";
        this.type = "Non-Vegetarian";
        System.out.println("Created: Non-Vegetarian Pizza");
    }
}

