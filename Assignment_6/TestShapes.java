import java.util.Scanner;
import org.shapes.Square;
import org.shapes.Triangle;
import org.shapes.Circle;

public class TestShapes {
	static Scanner sc = new Scanner(System.in);
	static void square(){
		System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("Area of Square: " + s.area());
        System.out.println("Perimeter of Square: " + s.perimeter());
	}
	static void triangle(){
		System.out.print("Enter three sides of triangle: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Triangle t = new Triangle(a, b, c);
		System.out.println("Area of Triangle: " + t.area());
		System.out.println("Perimeter of Triangle: " + t.perimeter());
	}
	static void circle(){
		System.out.print("Enter radius of circle: ");
		double r = sc.nextDouble();
		Circle c1 = new Circle(r);
		System.out.println("Area of Circle: " + c1.area());
		System.out.println("Perimeter of Circle: " + c1.perimeter());
	}
	
	
    public static void main(String[] args) {
        System.out.println("Choose a Shape:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                square();
                break;
            case 2:
                triangle();
                break;
            case 3:
                circle();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
