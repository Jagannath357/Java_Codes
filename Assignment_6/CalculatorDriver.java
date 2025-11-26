interface Calculator{
	float add(float a, float b);
	float sub(float a, float b);
	float mul(float a, float b);
	float div(float a, float b);
}
class DemoCalculator implements Calculator{
	public float add(float a, float b){
		return a+b;
	}
	public float sub(float a, float b){
		return a-b;
	}
	public float mul(float a, float b){
		return a*b;
	}
	public float div(float a, float b){
		return a/b;
	}
}

public class CalculatorDriver{
	public static void main(String args[]){
		Calculator c = new DemoCalculator();
		float a = 12.0f, b = 23.0f;
		System.out.println("\na = 12, b = 23");
		System.out.println("Sum : "+c.add(a, b));
		System.out.println("Sub : "+c.sub(a, b));
		System.out.println("Mul : "+c.mul(a, b));
		System.out.println("Div : "+c.div(a, b));
	}
	
}