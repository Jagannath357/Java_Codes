import java.util.Scanner;

class ComplexCalc{
	double real, img;
	void initialise(double real, double img){
		this.real = real;
		this.img = img;
	}
	void display(){
		System.out.println(real+" + i "+img);
	}
	ComplexCalc add(ComplexCalc c2){
		ComplexCalc c3 = new ComplexCalc();
		c3.real = real + c2.real;
		c3.img = img + c2.img;
		return c3;
	}
}
public class Complex{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ComplexCalc c1 = new ComplexCalc();
		ComplexCalc c2 = new ComplexCalc();
		
		System.out.println("\nEnter first complex number :");
		System.out.print("Real part :");
		double real = sc.nextDouble();
		System.out.print("Imaginary part :");
		double img = sc.nextDouble();
		
		c1.initialise(real, img);
		
		System.out.println("\nEnter second complex number :");
		System.out.print("Real part :");
		real = sc.nextDouble();
		System.out.print("Imaginary part :");
		img = sc.nextDouble();
		
		c2.initialise(real, img);
		System.out.println("Addition Result :");
		ComplexCalc c3 = c1.add(c2);
		c3.display();
	}
}