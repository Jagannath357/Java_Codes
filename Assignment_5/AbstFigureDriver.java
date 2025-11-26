import java.util.Scanner;

abstract class AbstFigure{
	double dim1, dim2;
	public AbstFigure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public abstract double getArea();
}
class Rectangle extends AbstFigure{
	public Rectangle(double d1, double d2){
		super(d1, d2);
	}
	public double getArea(){
		return dim1*dim2;
	}
}
class Triangle extends AbstFigure{
	public Triangle(double d1, double d2){
		super(d1, d2);
	}
	public double getArea(){
		return 0.5*dim1*dim2;
	}
}

public class AbstFigureDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		AbstFigure f;
		System.out.println("\nEnter the Length and Breadth of Rectangle :");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		f = new Rectangle(l, b);
		System.out.println("Area of the Rectangle is : "+f.getArea());
		
		System.out.println("\nEnter the Base and Height of Triangle :");
		b = sc.nextDouble();
		double h = sc.nextDouble();
		f = new Triangle(b, h);
		System.out.println("Area of the Triangle is : "+f.getArea());
		
	}
}