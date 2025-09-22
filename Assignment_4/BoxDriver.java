import java.util.Scanner;

class Box{
	float width, height, depth;
	public Box(float width, float height, float depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public float volumeBox(){
		return width*height*depth;
	}
}

public class BoxDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter box Details :\n");
		System.out.print("Width : ");
		float a = sc.nextFloat();
		System.out.print("Height : ");
		float b = sc.nextFloat();
		System.out.print("Depth : ");
		float c = sc.nextFloat();
		Box b1 = new Box(a, b, c);
		float vol = b1.volumeBox();
		System.out.println("Volume is : "+vol);
	}
}