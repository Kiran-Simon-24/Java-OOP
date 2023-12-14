package oop.RealWorldExample;

public class MainClass {

	public static void main(String[] args) {
		
		Person person1 = new Person(101, "John");
		Person person2 = new Person(102, "David");
		
		Address address1 = new Address("Trenton","New Jersey", "USA");
		Address address2 = new Address("Buffalo","New York", "USA");
		//has-a relation
		Employee e1 = new Employee(person1, "Frontend Developer", 100, address1);
		Employee e2 = new Employee(person2,"Backend Developer", 200, address2);
		
		
		e1.display();
		e2.display();

	}

}
