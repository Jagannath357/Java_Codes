import java.util.Scanner;
import java.io.*;

class MyThread extends Thread{
	public void run(){
		System.out.println("Thread Running");
	}
}
class DriverTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MyThread t1 = new MyThread();		
		t1.setName("Thread 1");
		t1.setPriority(4);
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println("Thread Reference : "+t1);
		System.out.println("Thread Id : "+t1.threadId());
		System.out.println("Thread Name : "+t1.getName());
		System.out.println("Thread Class : "+t1.getClass().getName());
		System.out.println("Thread Priority : "+t1.getPriority());
	}
}
