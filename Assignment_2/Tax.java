import java.util.*;

class Tax{
	
	public static double calcTax(int income){
		double tax;
		if(income < 150000)
			tax = 0.0d;
		else if(income > 150000 && income <= 300000)
		{
			System.out.println("10% tax Charged for "+income);
			tax = Math.round((income * 0.1) * 100.0) / 100.0;
		}
		else if(income > 300000 && income <= 500000){
			System.out.println("20% tax Charged for"+income);
			tax = Math.round((income * 0.2) * 100.0) / 100.0;
		}
		else{
			System.out.println("30% tax Charged for"+income);
			tax = Math.round((income * 0.3) * 100.0) / 100.0;
		}
		
		return tax;
			
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your income");
		int income = sc.nextInt();
		
		double tax = calcTax(income);
		
		System.out.println("Your tax is "+tax);
		
	}
}