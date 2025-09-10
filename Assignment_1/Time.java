import java.util.Scanner;

class Time{
	
	static void showTime(int sec){
		int hour, minute, newSec;
		
		String h = "", m = "", s = "";
		
		
		hour = sec / 3600;
		minute = (sec % 3600) / 60;
		newSec = (sec % 3600) % 60;
		if(hour > 1)
			h = "s";
		if(minute > 1)
			m = "s";
		if(newSec > 1)
			s = "s";
		
		System.out.println("\n"+hour+"hour"+h+" : "+minute+"minute"+m+" : "+newSec+"second"+s+"\n");
		
	}
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter time in Second:\n");
		int sec = sc.nextInt();
		
		showTime(sec);

	}
}