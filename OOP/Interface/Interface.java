package Interface;
// Multiple inheritance is not possible in java using Class, we can use Interface to define multiple inheritance
// Interface --> what to do but not how to do
// acheive abstraction,multiple inheritance
// java 1.8 v --> method definition were allowed --> default methods

//Single Abstract Method Interface --> SAM Interface --> Interface Contains only one abstract method 
// SAM interface also called as Funtional interface --> java 8, Lambda Expression

interface Readable{  // instance variables are not allowed.
    // cannot be instanciated - no constructors
    // an interface can extend anothe interface/interfaces
    int MAX_SPEED = 90; //variables are implicitly public,final,static
    void ride();  //methods are public abstract by default // abstract method
    default void display(){  // default methods can have method definition
        System.out.println("Hello form Ridable interface");
    }
}
class Car implements Readable{
    public void ride(){  // must define all the methods present in the interface,if not we can change the class to abstarct.
        System.out.println("You are riding a car");
    }
    public void display(){ // can override default methods of interface
        System.out.println("Hello form Car class");
    }
}

class Bike implements Readable{  //can implement an infinite number of interfaces
    public void ride(){
        System.out.println("You are riding a bike");
    }
}

class Mechanic{
    void check(Readable r){
        System.out.println("Checking");
        r.ride();  // Dynamic Binding
    }
}
public class Interface {
    public static void main(String[] args) {
        // can not create object for interface, can store reference
        Readable r = new Car();
        r.display();
        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b = new Bike();
        m.check(c);
        m.check(b);

        Readable r2 = new Readable() {  // anonymous class for interface obj
            public void ride(){
                System.out.println("Im riding a vintage car");
            }
        };
        r2.ride();
        
        // Lambda Expression - Functional Interface
        Readable r3 = () ->  System.out.println("Im riding a electric car");  // overriding the one and only abstract method in functional interface.
        r3.ride();
    }
    
}
