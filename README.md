# Restaurant Management System

## 1. Project Title

**Restaurant Management System**

## 2. Student Information

**Student Full Names:**
- Salma Maher
- Menna Suliman

**Student IDs:**
- 192100120
- 192100017

**University Emails:**
- 192100120@ecu.edu.eg
- 192100017@ecu.edu.eg

## 3. Project Description

The Restaurant Management System is a Java console-based application designed to manage restaurant operations. The system handles order processing, meal management, and payment processing. It provides a structured approach to managing restaurant workflows through a well-organized codebase.

The application demonstrates the use of multiple design patterns to create a maintainable and scalable system. It separates different concerns of restaurant management into distinct components, making the code easier to understand and modify.

## 4. Project Objectives

The main objectives of this project are:

- Demonstrate proper use of design patterns in software development
- Improve code organization and maintainability
- Separate responsibilities using object-oriented programming principles
- Simulate basic restaurant operations including order placement, meal preparation, and payment processing

## 5. Design Patterns Used

The project implements the following design patterns:

- **Singleton**: Ensures a single instance of the restaurant system throughout the application
- **Builder**: Constructs complex order objects step by step
- **Factory**: Creates different types of orders (dine-in and take-away)
- **Abstract Factory**: Creates families of related meal products (vegetarian and non-vegetarian)
- **Bridge**: Separates payment abstraction from payment implementation
- **Command**: Encapsulates restaurant operations as commands
- **Chain of Responsibility**: Processes orders through a chain of validation handlers

## 6. Technologies Used

- **Java**: Core programming language
- **Object-Oriented Programming**: Fundamental programming paradigm
- **Console Application**: Text-based user interface

## 7. Project Structure

The project is organized into several packages, each with a specific responsibility:

- **system**: Contains core system classes including the restaurant system and menu management
- **order**: Handles order-related classes and order types
- **builder**: Implements the Builder pattern for order construction
- **factory**: Contains factory classes for creating different order types
- **abstractfactory**: Implements the Abstract Factory pattern for meal creation
- **bridge**: Manages payment processing using the Bridge pattern
- **command**: Implements the Command pattern for restaurant operations
- **chain**: Contains handlers for the Chain of Responsibility pattern
- **main**: Contains the main application entry point

## 8. How to Run the Project

### Prerequisites

- Java Development Kit (JDK) version 8 or higher must be installed on your system
- Verify installation by running `java -version` and `javac -version` in the command prompt

### Compilation

1. Open a command prompt or terminal
2. Navigate to the project directory
3. Compile all Java files using the following command:

```bash
javac -d bin -sourcepath src src/main/Main.java
```

This command will:
- Create a `bin` directory for compiled class files
- Compile all Java source files including their dependencies

### Execution

After successful compilation, run the application using:

```bash
java -cp bin main.Main
```

The application will execute and display output demonstrating all implemented design patterns in the console.

## 9. How to Edit or Change Values

To customize the application with different values, you can modify the `Main.java` file located in `src/main/Main.java`. Here are the main areas where you can make changes:

### Changing Order Details

In the Builder pattern section, you can modify:
- **Order ID**: Change the order identifier (e.g., "ORD001" to "ORD100")
- **Order Items**: Add or remove items from the order list
- **Total Price**: Modify the price value (e.g., 18.99 to 25.50)

Example:
```java
Order order1 = new OrderBuilder()
    .setOrderId("ORD100")           // Change order ID
    .addItem("Pasta")               // Add different items
    .addItem("Salad")
    .setTotalPrice(22.50)           // Change price
    .setPayment(new CashPayment())
    .build();
```

### Changing Payment Methods

You can switch between payment types:
- Use `new CashPayment()` for cash payments
- Use `new CardPayment()` for card payments

### Changing Order Types

Modify the factory pattern section to create different order types:
- `new DineInOrderFactory()` creates dine-in orders
- `new TakeAwayOrderFactory()` creates take-away orders

### Changing Meal Names

To change meal names, edit the following files:
- **Vegetarian Meals**: Edit `VegetarianBurger.java`, `VegetarianPizza.java`, and `VegetarianDrink.java` in `src/abstractfactory/`
- **Non-Vegetarian Meals**: Edit `NonVegetarianBurger.java`, `NonVegetarianPizza.java`, and `NonVegetarianDrink.java` in `src/abstractfactory/`

In each file, modify the `name` field in the constructor:
```java
this.name = "Your Custom Meal Name";
```

### Changing Command Parameters

In the Command pattern section, modify the order ID used in commands:
```java
Command placeOrder = new PlaceOrderCommand(orderService, "ORD005");  // Change order ID
Command prepareOrder = new PrepareOrderCommand(kitchen, "ORD005");   // Change order ID
Command cancelOrder = new CancelOrderCommand(orderService, "ORD005"); // Change order ID
```

### Changing Chain Handler Values

The Chain of Responsibility pattern processes orders automatically. To test with different orders, create a new order in the chain section:
```java
Order order4 = new OrderBuilder()
    .setOrderId("ORD200")           // Change order ID
    .addItem("Custom Item")         // Add custom items
    .setTotalPrice(30.00)           // Change price
    .setPayment(new CardPayment())  // Change payment method
    .build();
```

### Important Notes

- After making any changes to Java files, you must **recompile** the project using the compilation command before running
- Changes to the `Main.java` file only require recompilation
- Changes to other class files may require recompiling the entire project
- Always ensure the syntax is correct to avoid compilation errors


