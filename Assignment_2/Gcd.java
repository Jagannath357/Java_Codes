import java.util.Scanner;

class Gcd{
	public static int gcd(int a, int b){
		if(b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("\nGcd of "+a+" and "+b+" is "+gcd(a, b));
	}
}