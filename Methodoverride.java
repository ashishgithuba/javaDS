class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds");
    }
}

class Dog extends Animal {
    @Override 
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Methodoverride {
    public static void main(String[] args) {
        Animal ref=new Dog();
        ref.makeSound();
    }
}
