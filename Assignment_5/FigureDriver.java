import java.util.Scanner;

class Figure{
	double dim1, dim2;
	public Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public void area(){
		System.out.println("Area of the figure is : "+(dim1*dim2));
	}
}
class Rectangle extends Figure{
	public Rectangle(double d1, double d2){
		super(d1, d2);
	}
	public void area(){
		System.out.println("Area of the Rectangle is : "+(dim1*dim2));
	}
}
class Square extends Figure{
	public Square(double d1){
		super(d1, d1);
	}
	public void area(){
		System.out.println("Area of the Square is : "+dim1*dim2);
	}
}
class Triangle extends Figure{
	public Triangle(double d1, double d2){
		super(d1, d2);
	}
	public void area(){
		System.out.println("Area of the Triangle is : "+0.5*dim1*dim2);
	}
}

public class FigureDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the Length and Breadth of Rectangle :");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		Rectangle r = new Rectangle(l, b);
		r.area();
		
		System.out.println("\nEnter the Side length of Square :");
		l = sc.nextDouble();
		Square s = new Square(l);
		s.area();
		
		System.out.println("\nEnter the Base and Height of Triangle :");
		b = sc.nextDouble();
		double h = sc.nextDouble();
		Triangle t = new Triangle(b, h);
		t.area();
		
	}
}