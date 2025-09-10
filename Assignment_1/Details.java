import java.util.Scanner;

class Details{	
	
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your details :");
		System.out.print("\nName :");
		String name = sc.nextLine();
		
		System.out.print("\nBranch :");
		String branch = sc.nextLine();
		
		System.out.print("\nSIC :");
		String sic = sc.nextLine();
		
		System.out.print("\nCollege Name :");
		String college = sc.nextLine();
		
		System.out.println();
		
		System.out.println("\n DETAILS : ");
		System.out.println("\n NAME : "+name);
		System.out.println("\n BRANCH : "+branch);
		System.out.println("\n SIC : "+sic);
		System.out.println("\n COLLEGE : "+college);
		

	}
}