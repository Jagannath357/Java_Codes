import java.util.Scanner;

class Account{
	String name;
	int acc_no;
	double balance;
	Account(String name, int acc_no, double balance){
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	void deposit(double amt){
		balance += amt;
	}
	void withdraw(double amt){
		try{
			if(balance - amt < 500){
				throw new MinimumBalanceException();
			}
			balance -= amt;
		}
		catch(MinimumBalanceException e){
			System.out.println("Error : "+e);
		}
	}
}
class OwnException extends Exception{
	String message = "MinimumBalanceException";
}
class MinimumBalanceException extends OwnException{
	
	public String toString(){
		return message+" : You are withdrawing more than minimum balance";
	}
	
}

public class AccountDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account holder's Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Account Number : ");
		int acc_no = sc.nextInt();
		System.out.print("Enter Balance : ");
		double balance = sc.nextDouble();
		
		Account acc = new Account(name, acc_no, balance);
		System.out.print("Enter Deposit Amount : ");
		double amt = sc.nextDouble();
		acc.deposit(amt);
		System.out.print("Enter Withdrawl Amount : ");
		amt = sc.nextDouble();
		
		acc.withdraw(amt);
		System.out.println("\nName : "+acc.name);
		System.out.println("Account no. : "+acc.acc_no);
		System.out.println("Balance is : "+acc.balance+"\n");
	}
}
