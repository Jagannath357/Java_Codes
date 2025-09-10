import java.util.Scanner;

class Binary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter a decimal number :");
		int dec = sc.nextInt();
		
		int binary = 0, rem = 0, i = 1, temp = dec;
		
		while(temp != 0){
			rem = temp % 2;
			binary += rem*i;
			temp /= 2;
			i *= 10;
		}
		System.out.println("\nBinary equivalent of "+dec+" is "+binary+"\n");
		
	}
}