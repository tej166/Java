// Example of an interface
public interface Printable {
    // Abstract method declaration
    void print();

    // Constant declaration
    String TYPE = "Printer";
}

// Example of a class implementing the interface
class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();  // Output: Printing...

        // Accessing constant from the interface
        System.out.println("Device type: " + Printable.TYPE);  // Output: Device type: Printer
    }
}
