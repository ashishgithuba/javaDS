// Abstract class
abstract class Vehicle {
    abstract void Start(); // Abstract method (no body)
}

// Subclass of Vehicle
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    void Start() {
        System.out.println("Car starts with a key");
    }

    void run() {
        System.out.println("Car is running");
    }

    void checkingGithub() {
        System.out.println("Checking git is working");
    }
    
     void scheckingGithub() {
        System.out.println("Checking git is working");
    }
}

// Main class
public class abstractA {
    public static void main(String[] args) {
        Vehicle ref = new Car(); // Parent reference, child object
        ref.Start(); // Calls the overridden method in Car
    }
}
