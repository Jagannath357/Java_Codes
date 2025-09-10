import java.util.Scanner;

class AddFloat{
	
	public static void main(String s[]){
		
		Scanner sc = new Scanner(System.in);
		
		float num1 ,num2;
		
		System.out.println("\nEnter two floating numbers :");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		float sum = num1 + num2;
		
		System.out.println("\nSum of "+num1+" and "+num2+" is "+sum+"\n");
		

	}
}