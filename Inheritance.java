class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {  
    String breed = "Road Chhap";

    void mydog() {
        System.out.println("Barkk");
    }
}

public class Inheritance {  
    public static void main(String[] args) {
        Dog myDog = new Dog(); 
        myDog.sound();  
        myDog.mydog(); 
    }
}
