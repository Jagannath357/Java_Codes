import java.util.Scanner;

class Student{
	String name, roll_no, branch;
	void setter(String name, String roll_no, String branch){
		this.name = name;
		this.roll_no = roll_no;
		this.branch = branch;
	}
	void getter(){
		System.out.println("\nStudent Details :");
		System.out.println("\nName :"+name);
		System.out.println("\nRoll no. :"+roll_no);
		System.out.println("\nBranch :"+branch);
	}
	
}
public class College{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter student Details :");
		System.out.print("Name :");
		String name = sc.nextLine();
		System.out.println("Roll no. :");
		String roll_no = sc.nextLine();
		System.out.println("Branch :");
		String branch = sc.nextLine();
		
		Student s1 = new Student();
		s1.setter(name, roll_no, branch);
		s1.getter();
	}
}