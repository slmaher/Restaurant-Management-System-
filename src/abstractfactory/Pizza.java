package abstractfactory;

/**
 * Abstract Pizza class implementing Meal interface.
 * Base class for different types of pizzas.
 */
public abstract class Pizza implements Meal {
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
        System.out.println("Pizza: " + name + " (" + type + ")");
    }
}

