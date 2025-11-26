import java.util.Scanner;

class PalindromeThread extends Thread {
	int num;
	PalindromeThread(int num) {
		this.num = num;
	}
	public void run() {
		int temp = num, rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev)
			System.out.println("The number " + num + " is a Palindrome.");
		else
			System.out.println("The number " + num + " is NOT a Palindrome.");
	}
}
public class DriverFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		PalindromeThread t = new PalindromeThread(n);
		t.start();
		boolean isPrime = true;
		if (n <= 1)
			isPrime = false;
		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime)
			System.out.println("The number " + n + " is a Prime number.");
		else
			System.out.println("The number " + n + " is a Composite number.");
	}
}