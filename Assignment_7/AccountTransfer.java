import java.util.Scanner;

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    Account() {
        this.name = "";
        this.acc_no = 0;
        this.balance = 0;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        try {
            if (balance - amt < 500) {
                throw new MinimumBalanceException("Transaction failed : After withdrawing your balance will go bellow minimum balance.");
            }
            balance -= amt;
        } catch (MinimumBalanceException e) {
            System.out.println("Error : " + e);
        }
    }
    static void transfer(Account acc1, Account acc2, double amt) throws MinimumBalanceException{
        if (acc1.balance - amt < 500) {
            throw new MinimumBalanceException("Transaction failed : Your tranaction will result going bellow minimum balance.");
        }
        acc1.balance -= amt;
    }
}

class OwnException extends Exception {
    String message = "MinimumBalanceException";
    OwnException(String str){
        this.message = str;
    }
    public String toString() {
        return message;
    }
}

class MinimumBalanceException extends OwnException {
    MinimumBalanceException(String str){
        super(str);
    }
}

public class AccountTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account holder's Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number : ");
        int acc_no = sc.nextInt();
        System.out.print("Enter Balance : ");
        double balance = sc.nextDouble();

        Account acc1 = new Account(name, acc_no, balance);
        System.out.print("Enter Deposit Amount : ");
        double amt = sc.nextDouble();
        acc1.deposit(amt);
        System.out.print("Enter Withdrawl Amount : ");
        amt = sc.nextDouble();

        acc1.withdraw(amt);
        Account acc2 = new Account();
        System.out.print("\nTransfer Amount : ");
        double tramt = sc.nextDouble();
        try {
            Account.transfer(acc1, acc2, tramt);
        } catch (MinimumBalanceException e) {
            System.out.println(e);
        }
        System.out.println("\nName : " + acc1.name);
        System.out.println("Account no. : " + acc1.acc_no);
        System.out.println("Balance is : " + acc1.balance + "\n");
    }
}
