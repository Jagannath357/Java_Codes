import java.util.Scanner;

class Account {
	String cus_name,acc_no;
	public Account(String cus_name, String acc_no){
		this.cus_name = cus_name;
		this.acc_no = acc_no;
	}
	void display(){
		System.out.println(cus_name);
		System.out.println(acc_no);
	}
}

class Savings_Account extends Account{
	double min_bal = 100.0d, saving_bal;
	public Savings_Account(String cus_name, String acc_no, double saving_bal){
		super(cus_name, acc_no);
		this.saving_bal = saving_bal;
	}
	void show(){
		System.out.println("Minimum balance is "+min_bal);
		System.out.println("Your Saving balance is "+saving_bal);
	}
}

class Account_details extends Savings_Account{
	double deposit, withdrawl;
	public Account_details(String cus_name, String acc_no, double saving_bal, double deposit, double withdrawl){
		super(cus_name, acc_no, saving_bal);
		this.deposit = deposit;
		this.withdrawl = withdrawl;
	}
	void showDetails(){
		this.saving_bal = this.saving_bal+this.deposit;
		this.saving_bal = this.saving_bal-this.withdrawl;
		System.out.println("Deposit : "+deposit);
		System.out.println("Withdrawal : "+withdrawl);
		System.out.println("Saving Balance : "+saving_bal);
	}
}

public class AccountDriver{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account holders name :");
		String cus_name = sc.nextLine();
		System.out.println("Enter Account no :");
		String acc_no = sc.nextLine();
		
		System.out.println("Enter Saving balance :");
		double saving_bal = sc.nextDouble();
		
		System.out.println("Enter Deposit and Withdrawal amount :");
		double deposit = sc.nextDouble();
		double withdrawl = sc.nextDouble();
		
		Account_details d = new Account_details(cus_name, acc_no, saving_bal, deposit, withdrawl);
		System.out.println("\nAccount Details :");
		d.display();
		d.show();
		d.showDetails();
		
	}
}