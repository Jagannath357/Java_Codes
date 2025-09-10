import java.util.Scanner;

class ReverseNum{
	
	static int reverseNum(int num){
		int r, temp = num, reverse = 0;
		while(temp != 0){
			r = temp % 10;
			temp = temp / 10;
			reverse = reverse*10 + r;
		}
		return reverse;
	}
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number:\n");
		int num = sc.nextInt();
		int reversedNumber = reverseNum(num);
		System.out.println("\nReversed number is :\n");
		System.out.println(reversedNumber+"\n");

	}
}