import java.util.Scanner;

class Odd{
	static void checkOdd(int num){
		if(num % 2 == 0)
			System.out.println("\n"+num+" is Even\n");
		else
			System.out.println("\n"+num+" is odd\n");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number\n");
		int num = sc.nextInt();
		checkOdd(num);
		
	}
	
}