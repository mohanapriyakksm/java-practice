package Oops;

class Employee {
    // Private variables to hide internal details
    private String name;
    private double salary;

    // Public constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method to access the private variable 'name'
    public String getName() {
        return name;
    }

    // Setter method to update the private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'salary'
    public double getSalary() {
        return salary;
    }

    // Setter method for 'salary' with validation to control access
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000);

        // Accessing and modifying the private variables through getters and setters
        System.out.println("Employee Name: " + emp.getName());
        emp.setSalary(55000);  // Valid salary update
        System.out.println("Updated Salary: " + emp.getSalary());

        emp.setSalary(-1000);  // Invalid salary update
    }
}

