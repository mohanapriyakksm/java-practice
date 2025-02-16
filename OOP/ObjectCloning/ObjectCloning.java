package ObjectCloning;

class Department implements Cloneable{
    int deptId;
    String name;

    Department(int id,String n){
        deptId = id;
        name = n;
    }

    void Display(){
        System.out.println("ID is:"+ deptId);
        System.out.println("Dept Name is:"+name);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();  // clone is present in Object class

    }
}

class Student implements Cloneable{
    int id;
    String name;
    Department dept;

    Student(int i,String n,Department d){
        id = i;
        name = n;
        dept = d;
    }

    protected Object clone() throws CloneNotSupportedException{
        // return super.clone();  // clone is present in Object class
        Student s = (Student)super.clone();
        s.dept = (Department)s.dept.clone();
        return s;

    }

    void Display(){
        System.out.println("ID is:"+ id);
        System.out.println("Name is:"+name);
        dept.Display();
    }
}

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept = new Department(1,"Physics");
        Student s1 = new Student(1, "Hari", dept);
        //Student s2 = s1;  // only the reference will be copied
        Student s2 = (Student)s1.clone();
        //System.out.println(s2.name);
        s1.Display();
        s2.Display();
        System.out.println("....");

        dept.name = "Maths";  // shallow copy  --> when we copy any object or non primitive data type, only the reference will be copied and it will point the same object, it doesnot point a separate copied object.
        s1.Display();        // Deep copy  --> creates a separate copied object
        s2.Display();

    }
    
}
