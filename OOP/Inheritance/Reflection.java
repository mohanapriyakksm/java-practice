package Inheritance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Employee e = new Employee("Diya",30000);  // we can create object for emp cls because that cls is present in the same package
        @SuppressWarnings("rawtypes")
        Class cls = e.getClass();  // reflection method for class for accessing class information
        //System.out.println(cls);
        System.out.println("Class name is : "+cls.getName());  // using the Class obj to get the name of the class --> Inheritance.Employee --> PackageName.ClassName

        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m.getName());  // this give all the methods present in the class along with the default Object class methods

        }

        try {
            System.out.println(methods[0].invoke(e));
        } catch (IllegalAccessException | InvocationTargetException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        System.out.println(Reflection.class);
        
        

    }
    
}

// we can invoke methods at runtime irrespective of the access specifier used with them.