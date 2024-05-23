// Interface 1
interface Animal {
    void eat();
    void sleep();
}

// Interface 2
interface Mammal {
    void breathe();
}

// Class implementing both interfaces
class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();      // Output: Dog is eating
        dog.sleep();    // Output: Dog is sleeping
        dog.breathe();  // Output: Dog is breathing
        dog.bark();     // Output: Dog is barking

        // Example of polymorphism
        Animal animal = new Dog();
        animal.eat();   // Output: Dog is eating
        animal.sleep(); // Output: Dog is sleeping

        Mammal mammal = new Dog();
        mammal.breathe(); // Output: Dog is breathing
    }
}

