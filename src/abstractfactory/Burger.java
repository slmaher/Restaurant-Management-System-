package abstractfactory;

/**
 * Abstract Burger class implementing Meal interface.
 * Base class for different types of burgers.
 */
public abstract class Burger implements Meal {
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
        System.out.println("Burger: " + name + " (" + type + ")");
    }
}

