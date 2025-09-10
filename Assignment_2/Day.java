import java.util.*;

class Day{
	public static void printDay(int day){
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednessday");
				break;
			case 4:
				System.out.println("Thurshday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default : 
				System.out.println("Enter a valid number for a day (1 - 7)");			
		}
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day number (1 to 7)");
		int day = sc.nextInt();
		
		printDay(day);
		
	}
}