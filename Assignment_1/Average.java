import java.util.Scanner;

class Average{
	static void avgSub(int a, int b, int c){
		float avg = 0.0f;
		
		avg = (a+b+c)/3;
		System.out.println("\nAverage is "+avg+"\n");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter marks of thrre Subjects\n");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		avgSub(a, b, c);
		
	}
	
}