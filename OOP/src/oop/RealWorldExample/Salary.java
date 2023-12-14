package oop.RealWorldExample;

// Abstraction

abstract interface calculate{
	final int working_hours = 160; 
	abstract void calculateSalary();
}

public class Salary implements calculate {
	float one_hour_payment, monthly_salary ;
	
	Salary(float one_hour_payment){
		this.one_hour_payment = one_hour_payment;
	}
	@Override
	public void calculateSalary() {
		 monthly_salary = one_hour_payment * working_hours;
	}
	
	void displaySalary() {
		System.out.println("Salary :" + " " + monthly_salary);
	}
}
