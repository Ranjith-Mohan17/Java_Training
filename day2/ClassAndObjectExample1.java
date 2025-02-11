package com.celcom.day2;

class Employee {
	int eid;
	String ename;
	double esalary;

	Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// copy constructor
	Employee(Employee e) {
		this.eid = e.eid;
		this.ename = e.ename;
		this.esalary = e.esalary;
	}

	void display() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class ClassAndObjectExample1 {
	public static void main(String args[]) {
		Employee emp1 = new Employee(19, "Ganesh", 1000.00);
		emp1.display();
		Employee emp2 = new Employee(20, "Kumar", 19000);
		emp2.display();
		// calling copy constructor
		Employee emp2Dup = new Employee(emp2);
		emp2Dup.display();
	}
}
