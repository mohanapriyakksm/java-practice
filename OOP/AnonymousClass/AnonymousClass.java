package AnonymousClass;

class Cycle{
    void display(){
        System.out.println("I'm a Cycle");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.display();
        Cycle c2 = new Cycle()
        {                      // anonymous class  --> can be used while we want to override an method for an object and use it only once.
            void display(){
                System.out.println("I'm a tricycle");
            }
        };
        c2.display();
    }
    
}
