import java.util.Scanner;

class Prime{
	static boolean checkPrime(int num){
		if(num < 0)
			return false;
		
		int count = 0;
		for(int i = 1;i <= (int)Math.sqrt(num);i++){
			if(num % i == 0){
				count++;
			}
		}
		if(count > 2)
			return false;
		else
			return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number\n");
		int num = sc.nextInt();
		if(checkPrime(num))
			System.out.println("\n"+num+" is a Prime Number\n");
		else
			System.out.println("\n"+num+" is not a Prime Number!\n");
		
	}
}