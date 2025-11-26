interface Read{
	void canRead();
}
interface Write{
	void canWrite();
}

class Human implements Read, Write{
	public void canRead(){
		System.out.println("Human can Read");
	}
	public void canWrite(){
		System.out.println("Human can Write");
	}
}

public class HumanDriver{
	public static void main(String args[]){
		Human h = new Human();
		h.canRead();
		h.canWrite();
	}
}