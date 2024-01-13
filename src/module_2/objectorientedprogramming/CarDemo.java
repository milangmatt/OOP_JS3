package module_2.objectorientedprogramming;

class Car {
    // Instance variables
    String brand;
    int year;
    String model;
    boolean engineStatus;

    // Constructor
    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engineStatus = false; // Assume the engine is initially not running
    }
    public Car() {
        this.brand = "Not branded";
        this.year = 0000;
        this.model = "Not registered";
        this.engineStatus = false; 
    }

    // Method to start the engine
    public void engineStart() {
        if (!engineStatus) {
            System.out.println("Starting the engine of the " + brand + " " + model);
            engineStatus = true;
        } else {
            System.out.println("The engine is already running.");
        }
    }

    // Method to stop the engine
    public void engineStop() {
        if (engineStatus) {
            System.out.println("Stopping the engine of the " + brand + " " + model);
            engineStatus = false;
        } else {
            System.out.println("The engine is already stopped.");
        }
    }

    // Method to display car statistics
    public void displayStats() {
        System.out.println("Engine Status: " + (engineStatus ? "Running" : "Stopped"));
    }
    
}


public class CarDemo {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car porsche911 = new Car("Porsche", 2023, "911 GT3 RS");
        Car bmwM4 = new Car("BMW", 2023, "M4 Competition");
        porsche911.displayStats();
        bmwM4.displayStats();

    }
}
