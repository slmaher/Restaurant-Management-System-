package main;

import system.RestaurantSystem;
import builder.OrderBuilder;
import order.Order;
import factory.OrderFactory;
import factory.DineInOrderFactory;
import factory.TakeAwayOrderFactory;
import order.OrderType;
import abstractfactory.MealFactory;
import abstractfactory.VegetarianMealFactory;
import abstractfactory.NonVegetarianMealFactory;
import abstractfactory.Burger;
import abstractfactory.Pizza;
import abstractfactory.Drink;
import bridge.Payment;
import bridge.CashPayment;
import bridge.CardPayment;
import command.Command;
import command.PlaceOrderCommand;
import command.PrepareOrderCommand;
import command.CancelOrderCommand;
import command.CommandInvoker;
import command.OrderService;
import command.Kitchen;
import chain.OrderHandler;
import chain.OrderValidationHandler;
import chain.IngredientCheckHandler;
import chain.PaymentApprovalHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  RESTAURANT MANAGEMENT SYSTEM DEMO");
        System.out.println("==========================================\n");
        
        // ============================================================
        // 1. SINGLETON PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 1: SINGLETON <<<");
        System.out.println("-------------------------------------------");
        RestaurantSystem system = RestaurantSystem.getInstance();
        system.startSystem();
        system.showStatus();
        System.out.println();
        
        // ============================================================
        // 2. BUILDER PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 2: BUILDER <<<");
        System.out.println("-------------------------------------------");
        Order order1 = new OrderBuilder()
            .setOrderId("ORD001")
            .addItem("Burger")
            .addItem("Fries")
            .addItem("Coke")
            .setTotalPrice(18.99)
            .setPayment(new CashPayment())
            .build();
        order1.displayOrder();
        
        Order order2 = new OrderBuilder()
            .setOrderId("ORD002")
            .addItem("Pizza")
            .addItem("Salad")
            .setTotalPrice(24.50)
            .setPayment(new CardPayment())
            .build();
        order2.displayOrder();
        System.out.println();
        
        // ============================================================
        // 3. FACTORY PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 3: FACTORY <<<");
        System.out.println("-------------------------------------------");
        OrderFactory dineInFactory = new DineInOrderFactory();
        OrderType dineInOrder = dineInFactory.createOrder();
        dineInOrder.processOrder();
        System.out.println("Order Type: " + dineInOrder.getOrderType());
        System.out.println();
        
        OrderFactory takeAwayFactory = new TakeAwayOrderFactory();
        OrderType takeAwayOrder = takeAwayFactory.createOrder();
        takeAwayOrder.processOrder();
        System.out.println("Order Type: " + takeAwayOrder.getOrderType());
        System.out.println();
        
        // ============================================================
        // 4. ABSTRACT FACTORY PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 4: ABSTRACT FACTORY <<<");
        System.out.println("-------------------------------------------");
        System.out.println("Creating Vegetarian Meals:");
        MealFactory vegFactory = new VegetarianMealFactory();
        Burger vegBurger = vegFactory.createBurger();
        Pizza vegPizza = vegFactory.createPizza();
        Drink vegDrink = vegFactory.createDrink();
        System.out.println("Vegetarian Meal Set: " + vegBurger.getName() + ", " + 
                          vegPizza.getName() + ", " + vegDrink.getName());
        System.out.println();
        
        System.out.println("Creating Non-Vegetarian Meals:");
        MealFactory nonVegFactory = new NonVegetarianMealFactory();
        Burger nonVegBurger = nonVegFactory.createBurger();
        Pizza nonVegPizza = nonVegFactory.createPizza();
        Drink nonVegDrink = nonVegFactory.createDrink();
        System.out.println("Non-Vegetarian Meal Set: " + nonVegBurger.getName() + ", " + 
                          nonVegPizza.getName() + ", " + nonVegDrink.getName());
        System.out.println();
        
        // ============================================================
        // 5. BRIDGE PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 5: BRIDGE <<<");
        System.out.println("-------------------------------------------");
        System.out.println("Order with Cash Payment:");
        order1.processPayment();
        System.out.println();
        
        System.out.println("Order with Card Payment:");
        order2.processPayment();
        System.out.println();
        
        System.out.println("Demonstrating Bridge flexibility - changing payment method:");
        order1.setPayment(new CardPayment());
        order1.processPayment();
        System.out.println();
        
        // ============================================================
        // 6. COMMAND PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 6: COMMAND <<<");
        System.out.println("-------------------------------------------");
        OrderService orderService = new OrderService();
        Kitchen kitchen = new Kitchen();
        CommandInvoker invoker = new CommandInvoker();
        
        System.out.println("Executing Place Order Command:");
        Command placeOrder = new PlaceOrderCommand(orderService, "ORD003");
        invoker.setCommand(placeOrder);
        invoker.executeCommand();
        
        System.out.println("Executing Prepare Order Command:");
        Command prepareOrder = new PrepareOrderCommand(kitchen, "ORD003");
        invoker.setCommand(prepareOrder);
        invoker.executeCommand();
        
        System.out.println("Executing Cancel Order Command:");
        Command cancelOrder = new CancelOrderCommand(orderService, "ORD003");
        invoker.setCommand(cancelOrder);
        invoker.executeCommand();
        System.out.println();
        
        // ============================================================
        // 7. CHAIN OF RESPONSIBILITY PATTERN DEMONSTRATION
        // ============================================================
        System.out.println(">>> PATTERN 7: CHAIN OF RESPONSIBILITY <<<");
        System.out.println("-------------------------------------------");
        Order order3 = new OrderBuilder()
            .setOrderId("ORD004")
            .addItem("Pasta")
            .addItem("Garlic Bread")
            .setTotalPrice(16.75)
            .setPayment(new CashPayment())
            .build();
        
        // Create handlers
        OrderValidationHandler validationHandler = new OrderValidationHandler();
        IngredientCheckHandler ingredientHandler = new IngredientCheckHandler();
        PaymentApprovalHandler paymentHandler = new PaymentApprovalHandler();
        
        // Set up the chain
        validationHandler.setNext(ingredientHandler);
        ingredientHandler.setNext(paymentHandler);
        
        System.out.println("Processing order through the chain:");
        validationHandler.handle(order3);
        System.out.println();
        
        // ============================================================
        // SUMMARY
        // ============================================================
        System.out.println("==========================================");
        System.out.println("  ALL DESIGN PATTERNS DEMONSTRATED");
        System.out.println("==========================================");
        System.out.println("✓ Singleton - RestaurantSystem");
        System.out.println("✓ Builder - OrderBuilder");
        System.out.println("✓ Factory - OrderFactory");
        System.out.println("✓ Abstract Factory - MealFactory");
        System.out.println("✓ Bridge - Payment");
        System.out.println("✓ Command - Order Commands");
        System.out.println("✓ Chain of Responsibility - Order Processing");
        System.out.println("==========================================");
    }
}

