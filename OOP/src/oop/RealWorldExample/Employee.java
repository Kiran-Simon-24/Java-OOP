package oop.RealWorldExample;

public class Employee extends Salary{
	Person person;
	String position;
	Address address;	//HAS-A Relation
	
	public Employee(Person person,String position,float one_hour_payment, Address address) {
		
		super(one_hour_payment);	//IS-A Relation
		this.person = person;
		this.position = position;
		this.address = address;
	}
	
	void display() {
		System.out.println("ID : " + person.id + " " + "\nName : "+ person.name);
		calculateSalary();	// calculate the salary
		super.displaySalary();	// display calculated salary;
		System.out.println("Address :" + " " +address.city + "," + " " + address.state + "," + " " + address.country);
		System.out.println();
	}
}