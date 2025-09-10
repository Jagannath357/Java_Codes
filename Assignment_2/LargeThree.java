import java.util.Scanner;

class LargeThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int large = a > b?(a > c?a:c):(b > c?b:c);
		
		System.out.println(large+" is Largest");
	}
}