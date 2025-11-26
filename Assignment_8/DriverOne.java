import java.util.Scanner;
import java.io.*;

class MyThread extends Thread{
	public void run(){
		System.out.println("Thread Running");
	}
}

class DriverOne{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);		
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(t1);

		t2.setName("Thread 2");
		t2.setPriority(4);
		t2.start();
		System.out.println(t2.isAlive());
		System.out.println("Thread Reference : "+t2);
		System.out.println("Thread Id : "+t2.threadId());
		System.out.println("Thread Name : "+t2.getName());
		System.out.println("Thread Class : "+t2.getClass().getName());
		System.out.println("Thread Priority : "+t2.getPriority());		
	}
}
