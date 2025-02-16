package Inheritance;

import java.util.Arrays;

class Employee implements Comparable<Employee>{ // base class, Super class, Parent class
	private String name;
	private double salary;
	Employee(String n, double s){
		name = n;
		salary = s;
	}
	Employee(){  // dummy constructor, if we do not manually use super() to call, the compiler will call super()  without constructor to avoid error in thid case, dummy constructory are used.
		name="";
		salary = 0.0;
	}

	public String getName(){return name;}
	public void setName(String n){name = n;}
	public double getSalary(){return salary;}
	public void setSalary(double s){salary =s;}

	void raiseSalary(double percent){
		salary += salary*percent/100;
	}

	@Override
	public int compareTo(Employee e) {
		if (salary == e.salary) return 0;
		if (salary<e.salary) return -1;
		return 1;
	}
}
//is a relationship  --> manager is a employee.
class Manager extends Employee{  // derived class, Sub class,Child class
	double bonus;
	Manager(String n,double s,double b){
		super(n,s);
		bonus = b;
	}
	void setBonus(double b){
		bonus = b;

	}

	@Override  // method present in parent class is been defined again to add some extra funtionalities
	public double getSalary() {
		return super.getSalary()+bonus;
	}

}

class Inheritance{
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", 35000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());

		Manager m1 = new Manager("John",65000,0);
		m1.setBonus(5000);
		System.out.println(m1.getSalary());

		Employee e2 = new Manager("Ramya", 10000, 0); // polymorphism
		System.out.println(e2.getSalary());

		
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("A",70008);
		employees[1] = new Employee("B",70006);
		employees[2] = new Employee("C",70007);
		employees[3] = new Employee("D",70004);
		employees[4] = new Manager("E",70005,0);

		for(Employee e:employees){  //dynamic binding -->calls the correct derived class
			System.out.println(e.getName()+" "+e.getSalary());
		}
		System.out.println("-----------");

		Arrays.sort(employees);

		for(Employee e:employees){  //dynamic binding -->calls the correct derived class
			System.out.println(e.getName()+" "+e.getSalary());
		}



	}
}