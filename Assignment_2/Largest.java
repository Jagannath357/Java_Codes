import java.util.Scanner;

class Largest{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int large = (a > b)?a:b;
		
		System.out.println(large+" is Largest");
	}
}