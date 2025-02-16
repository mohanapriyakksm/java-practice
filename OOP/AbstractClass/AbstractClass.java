package AbstractClass;
/* abstract classes are typically used to represent abstract concepts or provide a common interface for 
 a group of related classes. They often define common behavior and characteristics shared by their subclasses. */

abstract class Member{  //a class must be declared as abstract if it has even one abstract method
    abstract void welcomeMessage(); // a abstract class can have both non abstract methods and abstract methods
}
class Teacher extends Member{
    void welcomeMessage(){ // all the abstract methods must be initialized in the sub class
        System.out.println("Welcome Teacher!");
    }
}
class Student extends Member{
    void welcomeMessage(){  // all the abstract methods must be initialized in the sub class
        System.out.println("Welcome Student!");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
       Teacher t1 = new Teacher();
       t1.welcomeMessage();
       Student s1 = new Student();
       s1.welcomeMessage(); 
       //we cannot create object for the abstract method due to Incomplete Implementation
       /*can be used as a reference type. This means you can have arrays, lists, 
       or other collections of Member objects, but you cannot create a new Member() object directly.*/

       Member[] m1  = new Member[4]; // Creating an array of Member objects
       m1[0]= new Student();
       m1[1]= new Student();
       m1[2]= new Teacher();
       m1[3]= new Teacher();

       for(Member m:m1){
        m.welcomeMessage();
       }
    }
    
    
}
