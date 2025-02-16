package InnerClass;

class Outer{
    void outerDisplay(){
        System.out.println("Outer Display...");
    }
    static class Inner{
        void innerDisplay(){
            System.out.println("Inner Display...");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        // Outer.Inner i = o.new Inner();  
        Outer.Inner i2 = new Outer.Inner();  // for static inner class
        //i.innerDisplay();
        i2.innerDisplay();

    }
    
}
