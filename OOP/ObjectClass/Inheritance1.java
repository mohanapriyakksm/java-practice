package ObjectClass;


// Object --> cosmic super class
class Employee extends Object{ // base class, Super class, Parent class
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

	//Overriding equals() method
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;
        Employee e = (Employee) obj;

        return this.name.equals(e.name) && this.salary==e.salary;


    }

	void raiseSalary(double percent){
		salary += salary*percent/100;
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

class Inheritance1{
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", 35000);
		//e1.raiseSalary(10);
		System.out.println(e1.getSalary());

		Manager m1 = new Manager("John",65000,0);
		m1.setBonus(5000);
		System.out.println(m1.getSalary());

		Employee e2 = new Employee("Ram", 35000); // polymorphism
		System.out.println(e2.getSalary());

		
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("A",70000);
		employees[1] = new Employee("B",70000);
		employees[2] = new Employee("C",70000);
		employees[3] = new Employee("D",70000);
		employees[4] = new Manager("E",70000,0);

		for(Employee e:employees){  //dynamic binding -->calls the correct derived class
			System.out.println(e.getName()+" "+e.getSalary());
		}

        System.out.println("------");
        System.out.println(e1.equals(e2));

        



	}
}


