import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double distance(Point p) {
		int dx = this.x - p.x;
		int dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

class Distance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first point :");
		System.out.print("Enter x coordinate: ");
		int x1 = sc.nextInt();
		System.out.print("Enter y coordinate: ");
		int y1 = sc.nextInt();
		System.out.println("\nEnter second point :");
		System.out.print("Enter x coordinate: ");
		int x2 = sc.nextInt();
		System.out.print("Enter y coordinate: ");
		int y2 = sc.nextInt();

		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);

		double dist = p1.distance(p2);

		System.out.println("The distance between two points: " + dist);
	}
}
