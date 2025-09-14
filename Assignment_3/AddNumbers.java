import java.util.Scanner;

class AddNumbers{
	public static void main(String args[]){
		float a = Integer.parseInt(args[0]);
		float b = Integer.parseInt(args[1]);
		float sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
}