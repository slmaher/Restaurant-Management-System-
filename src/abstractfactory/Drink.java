package abstractfactory;

/**
 * Abstract Drink class implementing Meal interface.
 * Base class for different types of drinks.
 */
public abstract class Drink implements Meal {
    protected String name;
    protected String type;
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    public void display() {
        System.out.println("Drink: " + name + " (" + type + ")");
    }
}

