import java.util.Scanner;

class Sign{
	static void checkNum(int num){
		if(num < 0)
			System.out.println("\n"+num+" is a Negetive Number\n");
		else if(num > 0)
			System.out.println("\n"+num+" is a Positive Number\n");
		else
			System.out.println("\n"+num+" is Eqals to 0\n");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number\n");
		int num = sc.nextInt();
		checkNum(num);
		
	}
	
}