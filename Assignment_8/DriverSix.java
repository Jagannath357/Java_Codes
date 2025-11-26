import java.util.Scanner;

class SquareThread extends Thread{
	int num;
	SquareThread(int num){
		this.num = num;
	}
	public void run(){
		int sq = num*num;
		System.out.println("Square of " + num + " is : "+sq+"\n");
	}
}
class SumThread extends Thread{
	int num;
	SumThread(int num){
		this.num = num;
	}
	public void run(){
		int sum = 0, temp = num, rem = 0;
		while(temp != 0){
			rem = temp%10;
			sum += rem;
			temp /= 10;
		}
		System.out.println("Sum of the digits of "+num+ " is : "+sum);
	}
}
public class DriverSix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		SquareThread t1 = new SquareThread(num);
		SumThread t2 = new SumThread(num);
		t1.start();
		try{
			t1.join();
		}catch(Exception e){
			System.out.println(e);
		}
		t2.start();
	}
}