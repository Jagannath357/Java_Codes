abstract class Shape{
	abstract void RectangleArea(float length, float breadth);
	abstract void SquareArea(float side);
	abstract void CircleArea(float radius);
}

class Area extends Shape{
	void RectangleArea(float length, float breadth){
		System.out.println("\nArea of Rectangle is : "+length*breadth);
	}
	void SquareArea(float side){
		System.out.println("Area of Square is : "+side*side);
	}
	void CircleArea(float radius){
		System.out.println("Area of Circle is : "+3.141*radius*radius);
	}
}

class ShapeDriver{
	public static void main(String args[]){
		Shape s = new Area();
		
		s.RectangleArea(10, 20);
		s.SquareArea(12);
		s.CircleArea(10);
	}
}