interface Animal {
    void sound();  // abstract method
    void sleep();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks ");
    }

    public void sleep() {
        System.out.println("Dog sleeps in kennel ");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows ");
    }

    public void sleep() {
        System.out.println("Cat sleeps on a couch ");
    }
}



public class Interface {
    
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Interface reference
        myDog.sound();
        myDog.sleep();

        System.out.println(); // For spacing

        Animal myCat = new Cat();  // Interface reference
        myCat.sound();
        myCat.sleep();
    }
}
