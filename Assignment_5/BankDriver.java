abstract class Bank{
	float roi;
	Bank(float roi){
		this.roi = roi;
	}
	abstract void getRateOfInterest();
}
class SBI extends Bank{
	public SBI(float roi){
		super(roi);
	}
	void getRateOfInterest(){
		System.out.println("SBI Rate of Interest : "+(int)roi+"\n");
	}
}
class ICICI extends Bank{
	public ICICI(float roi){
		super(roi);
	}
	void getRateOfInterest(){
		System.out.println("ICICI Rate of Interest : "+(int)roi+"\n");
	}
}
class AXIS extends Bank{
	public AXIS(float roi){
		super(roi);
	}
	void getRateOfInterest(){
		System.out.println("AXIS Rate of Interest : "+(int)roi+"\n");
	}
}

public class BankDriver{
	public static void main(String args[]){
		Bank b;
		b = new SBI(8);
		b.getRateOfInterest();
		
		b = new ICICI(7);
		b.getRateOfInterest();
		
		b = new AXIS(9);
		b.getRateOfInterest();
	}
}