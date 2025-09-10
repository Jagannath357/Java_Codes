import java.util.*;

class Grade{
	
	public static void displayGrade(int a, int b, int c, int d){
		int avg = (a + b + c + d) / 4;
		if(avg >= 90)
			System.out.println("Grade is O");
		else if(avg >= 80 && avg < 90)
			System.out.println("Grade is E");
		else if(avg >= 70 && avg < 80)
			System.out.println("Grade is A");
		else if(avg >= 60 && avg < 70)
			System.out.println("Grade is B");
		else if(avg >= 50 && avg < 60)
			System.out.println("Grade is C");
		else
			System.out.println("Grade is F");
		
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		displayGrade(a, b, c, d);
		
	}
}