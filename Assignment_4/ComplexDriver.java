import java.util.Scanner;
class ComplexNum{
	float real, img;
	public ComplexNum(float real, float img){
		this.real = real;
		this.img = img;
	}
	public void displayCompNumber(){
		System.out.println(""+real+" + "+img+"i");
	}
	public ComplexNum addCompNumber(ComplexNum c2){
		float r = this.real + c2.real;
		float i = this.img + c2.img;
		ComplexNum c3 = new ComplexNum(r, i);
		return c3;
	}
}

public class ComplexDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter first complex number :");
		System.out.print("Real part :");
		float real = sc.nextFloat();
		System.out.print("Imaginary part :");
		float img = sc.nextFloat();
		ComplexNum c1 = new ComplexNum(real, img);
		
		System.out.println("\nEnter Second complex number :");
		System.out.print("Real part :");
		real = sc.nextFloat();
		System.out.print("Imaginary part :");
		img = sc.nextFloat();
		ComplexNum c2 = new ComplexNum(real, img);
		
		ComplexNum c3 = c1.addCompNumber(c2);
		System.out.println("Addition result :");
		c3.displayCompNumber();
	}
}