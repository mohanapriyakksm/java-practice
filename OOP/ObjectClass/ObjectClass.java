package ObjectClass;

//equals(Object obj)
// every class is an object class [public class clsname extends Object] Object --> cosmic super class
public class ObjectClass extends Object{
    public static void main(String[] args) {
        String s1 = "Java";  //directly initiated
        String s2 = "Java";
        String s3 = new String("Java");  // initiated by creating object
        String s4 = new String("Java");

        System.out.println(s1==s2);  // stored in string constant
        System.out.println(s3==s4);  // finds whether both the obj reffers the same refference
        System.out.println(s3.equals(s4));  // boolean equals(Object object)  --> present in cosmic super class it determines whether one object is equal to another.
        // the equals method is already overriden in object class to handle string
    }
}
