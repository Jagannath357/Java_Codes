class Shape{
	void draw(){
		System.out.println("Drawing Shape");
	}
	void erase(){
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle");
	}
	void erase(){
		System.out.println("Erasing Circle\n");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("Drawing Triangle");
	}
	void erase(){
		System.out.println("Erasing Triangle\n");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Drawing Square");
	}
	void erase(){
		System.out.println("Erasing Square\n");
	}
}

class ShapeDriver{
	public static void main(String args[]){
		Shape circleObj = new Circle();
		Shape triangleObj = new Triangle();
		Shape squareObj = new Square();
		
		circleObj.draw();
		circleObj.erase();
		
		triangleObj.draw();
		triangleObj.erase();
		
		squareObj.draw();
		squareObj.erase();
	}
}