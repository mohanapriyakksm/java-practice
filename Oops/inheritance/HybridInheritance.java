package inheritance;

// Base class
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass of Animal
class Mammal extends Animal {
    public void giveBirth() {
        System.out.println("Mammal gives birth to live young.");
    }
}

// Interface for flying behavior
interface Flyer {
    void fly();
}

// Interface for swimming behavior
interface Swimmer {
    void swim();
}

// Class that inherits from Mammal and implements Flyer and Swimmer
class Duck extends Mammal implements Flyer, Swimmer {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        
        // Using methods from Animal, Mammal, Flyer, and Swimmer
        duck.eat();        // Output: Animal is eating.
        duck.giveBirth();  // Output: Mammal gives birth to live young.
        duck.fly();       // Output: Duck is flying.
        duck.swim();      // Output: Duck is swimming.
    }
}

