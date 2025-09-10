import java.util.Scanner;

class SumDigit{
	
	static int sumDigit(int num){
		int r = 0, sum = 0;
		while(num != 0){
			r = num % 10;
			num = num / 10;
			sum += r;
		}
		return sum;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a number\n");
		int num = sc.nextInt();
		
		int sum = sumDigit(num);
		System.out.println("\nSum of the Digits of "+ num +" is "+sum+"\n");
		
	}
}