class Employee{
	int id;
	String name;
	int dpt_no;
	float salary;
	Employee(int id, String name, int dpt_no, float salary){
		this.id = id;
		this.name = name;
		this.dpt_no = dpt_no;
		this.salary = salary;
	}
	void showDetails(){
		System.out.println("Details of Employee :");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Department no : "+dpt_no);
		System.out.println("Salary : "+salary);
	}
	public static void main(String e[]){
		if(e.length != 4){
			System.out.println("Error : You have to enter id, name, dpt_no, salary");
		}
		else{
			Employee e1 = new Employee(Integer.parseInt(e[0]), e[1], Integer.parseInt(e[2]), Float.parseFloat(e[3]));
			e1.showDetails();
		}
	}
}