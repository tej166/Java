// Parent class
public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
// Child class extending Vehicle
class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); // Call to parent class constructor
        this.model = model;
    }

    public void displayInfo() {
        super.displayInfo(); // Call to parent class method
        System.out.println("Model: " + model);
    }
}
// Main program to demonstrate single-level inheritance
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.displayInfo();
    }
}

