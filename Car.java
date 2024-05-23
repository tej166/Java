public class Car {
    private String brand;
    private String model;
    private int year;

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
    public static void main(String[] args) {
        // Creating objects using both constructors
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car();  // Using default constructor

        // Calling method to display car details
        car1.displayDetails();
        car2.displayDetails();
//////////////////////////////////////////////////////////////////////////////
        // Car car1 = new Car();
        // cbar1.setCarDetails("Toyota", "Camry", 2022);

        // Car car2 = new Car();
        // car2.setCarDetails("Honda", "Civic", 2021);

        // // Calling method to display car details
        // car1.displayDetails();
        // car2.displayDetails();
    }
}


// public class Car{
//         private String brand;
//         private int year;

//         public Car(String brand, int year){
//             this.brand = brand;
//             this.year =  year;
//         }

//         public Car(){
//             this.brand = "Unknown";
//             this.year = 0;
//         }

//         public void display(){
//             System.out.println("brand: " + brand + '\n' + "year: " + year);
//         }

//         public static void main(String[] args) {
//             Car c1 =  new Car("Toyota", 2004);

//             c1.display();
//         }

// }