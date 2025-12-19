package system;

public class RestaurantSystem {
    
    private static RestaurantSystem instance;
  
    private RestaurantSystem() {
        System.out.println("RestaurantSystem instance created.");
    }
   
    public static RestaurantSystem getInstance() {
        if (instance == null) {
            instance = new RestaurantSystem();
        }
        return instance;
    }
    

    public void startSystem() {
        System.out.println("Restaurant Management System is starting...");
        System.out.println("System initialized successfully!");
    }
    
    public void showStatus() {
        System.out.println("Restaurant Management System is running.");
        System.out.println("Status: Active");
    }
}

