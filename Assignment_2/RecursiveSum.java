import java.util.Scanner;

class RecursiveSum{
	static int sum = 0;
	public static int sumNumbers(int n){
		if(n <= 1){
			return n;
		}
		return n + sumNumbers(n-1);
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int sum = sumNumbers(num);
		System.out.println("Sum of "+num+" Natural numbers is "+sum);
	}
}