class Person{
	String name;
	public Person(String name){
		this.name = name;
	}
	void display(){
		System.out.println("Name : "+name);
	}
}
class Employee extends Person{
	private int emp_id;
	Employee(String name, int emp_id){
		super(name);
		this.emp_id = emp_id;
	}
	void display(){
		super.display();
		System.out.println("EmpID : "+emp_id);
	}
}
class HourlyEmployee extends Employee{
	private double hourlyRate, hoursWorked;
	HourlyEmployee(String name, int emp_id, double hourlyRate, double hoursWorked){
		super(name, emp_id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	double getGrossPay(){
		return hourlyRate*hoursWorked;
	}
	void display(){
		super.display();
		System.out.println("Hourly Rate : "+hourlyRate);
		System.out.println("Hours Worked : "+hoursWorked);
		System.out.println("Gross Pay : "+getGrossPay());
	}
}

public class PersonDriver{
	public static void main(String args[]){
		HourlyEmployee e = new HourlyEmployee("John Smith", 7569, 100, 2000);
		e.display();
	}
}