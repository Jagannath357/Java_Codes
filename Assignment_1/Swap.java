import java.util.Scanner;

class Swap{
	public static void display(int a, int b){
		System.out.println("\nNum1 = "+a+", Num2 = "+b);
	}
	
	public static void main(String s[]){
		
		Scanner sc = new Scanner(System.in);
		
		int num1 ,num2;
		
		System.out.println("\nEnter two  numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		display(num1, num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		display(num1, num2);
		
	}
}