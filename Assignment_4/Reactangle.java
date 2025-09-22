import java.util.Scanner;

class Area{
	float length, breadth;
	void setDim(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	double getArea(){
		return length*breadth;
	}
}
public class Reactangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Area a1 = new Area();
		
		System.out.println("\nEnter Reactangle Detals :");
		System.out.print("Length :");
		float length = sc.nextFloat();
		System.out.print("Breadth :");
		float breadth = sc.nextFloat();
		
		a1.setDim(length, breadth);
		double area = a1.getArea();
		System.out.println("Area of Reactangle is : "+area);
	}
}