import java.util.Scanner;

class Factotrial{
	public static int calcFactorial(int num){
		if(num == 0 || num == 1)
			return 1;
		return num * calcFactorial(num-1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int fact = calcFactorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}