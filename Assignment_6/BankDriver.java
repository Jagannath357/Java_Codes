abstract class Bank{
	float roi;
	Bank(float roi){
		this.roi = roi;
	}
	abstract void getROI();
}
class SBI extends Bank{
	SBI(float r){
		super(r);
	}
	void getROI(){
		System.out.println("\nSBI Rate of Interest : "+roi);
	}
}
class PNB extends Bank{
	PNB(float r){
		super(r);
	}
	void getROI(){
		System.out.println("PNB Rate of Interest : "+roi);
	}
}
class BOI extends Bank{
	BOI(float r){
		super(r);
	}
	void getROI(){
		System.out.println("BOI Rate of Interest : "+roi);
	}
}

public class BankDriver{
	public static void main(String args[]){
		Bank b;
		b = new SBI(8);
		b.getROI();
		b = new PNB(7);
		b.getROI();
		b = new BOI(9);
		b.getROI();
	}
}