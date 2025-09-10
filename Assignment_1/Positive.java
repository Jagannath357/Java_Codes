import java.util.Scanner;

class Positive{
	static void checkSign(int num){
		if(num < 0)
			System.out.println("\n"+num+" is a Negetive Number\n");
		else
			System.out.println("\n"+num+" is a Positive Number\n");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number\n");
		int num = sc.nextInt();
		checkSign(num);
		
	}
	
}