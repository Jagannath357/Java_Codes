import java.util.Scanner;
import java.io.*;

class MyThread extends Thread{
	int num;
	boolean res = false;
	MyThread(int num){
		this.num = num;
	}
	public void run(){		
		int len = String.valueOf(num).length();		
		int rem = 0, sum = 0;
		int temp = num;
		while(temp != 0){
			rem = temp % 10;
			sum += (int)Math.pow(rem, len);
			temp /= 10;
		}
		if(sum == num)
			System.out.println("ArmStrong");
		else
			System.out.println("Not ArmStrong");
	}
}
class DriverThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		Thread t2 = new Thread();
		MyThread t1 = new MyThread(num);
		t1.setName("Thread 1");
		t1.setPriority(4);
		t1.start();	
	}
}
