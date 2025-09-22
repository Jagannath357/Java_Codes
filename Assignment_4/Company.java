import java.util.Scanner;

class Employee{
	int empid;
	String ename, dept;
	float sal;
	void putData(int empid, String ename, String dept, float sal){
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	void getData(){
		System.out.println("\nEmployee Details : ");
		System.out.println("ID : "+empid);
		System.out.println("Name : "+ename);
		System.out.println("Department : "+dept);
		System.out.println("Salary : "+sal);
	}
}
public class Company{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Employees :");
		int n = sc.nextInt();
		Employee e[] = new Employee[n];
		for(int i = 0; i < n; i++){
			e[i] = new Employee();
			System.out.println("\nEnter Employee Details : ");
			System.out.print("ID : ");
			int empid = sc.nextInt();
			sc.nextLine(); 
			System.out.print("Name : ");
			String ename = sc.nextLine();
			System.out.print("Department : ");
			String dept = sc.nextLine();
			System.out.print("Salary : ");
			float sal = sc.nextFloat();
			e[i].putData(empid, ename, dept, sal);
		}
		for (Employee emp : e) {
			emp.getData();
		}
	}
}