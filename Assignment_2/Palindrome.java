import java.util.Scanner;

class Palindrome{
	public static boolean checkPalindrome(int num){
		int rem = 0, rev = 0, temp = num;
		while(temp != 0){
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}		
		if(num == rev)
			return true;
		else
			return false;
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter a number :");
		int num = sc.nextInt();
		
		if(checkPalindrome(num)){
			System.out.println(num+" is a Palindrome number");
		}else{
			System.out.println(num+" is not a Palindrome number");
		}
		
	}
}