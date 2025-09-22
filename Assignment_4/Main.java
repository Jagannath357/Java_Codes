import java.util.Scanner;

class Average{
	float a, b, c;
	Average(float a, float b, float c){
		this.a  = a;
		this.b = b;
		this.c = c;
	}
	void getter(){
		System.out.println("\n"+a+" "+b+" "+c+"\n");
	}
	float calcAvg(){
		return (a+b+c)/3;
	}
}
public class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		Average a1 = new Average(a, b, c);
		a1.getter();
		float avg = a1.calcAvg();
		System.out.println("Average is : "+avg);
	}
}