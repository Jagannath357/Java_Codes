import java.util.Scanner;

class Point2D{
	float x, y;
	public Point2D(){
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point2D(float x, float y){
		this.x = x;
		this.y = y;
	}
	void display(){
		System.out.println("X-Coordinate : "+x);
		System.out.println("Y-Coordinate : "+y);
		System.out.println();
	}
}
class Point3D extends Point2D{
	float z;
	public Point3D(float x, float y, float z){
		super(x, y);
		this.z = z;
	}
	void show(){
		System.out.println("X-Coordinate : "+x);
		System.out.println("Y-Coordinate : "+y);
		System.out.println("Z-Coordinate : "+z);
		System.out.println();
	}
}

public class PointDriver{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		Point2D p1 = new Point2D();
		p1.display();
		
		System.out.println("Enter a 2D point");
		System.out.print("X : ");
		float x = sc.nextFloat();
		System.out.print("Y : ");
		float y = sc.nextFloat();
		
		Point2D p2 = new Point2D(x, y);
		p2.display();
		
		System.out.println("Enter a 3D point");
		System.out.print("X : ");
		x = sc.nextFloat();
		System.out.print("Y : ");
		y = sc.nextFloat();
		System.out.print("Z : ");
		float z = sc.nextFloat();
		
		Point3D p3 = new Point3D(x, y, z);
		p3.show();
	}
}