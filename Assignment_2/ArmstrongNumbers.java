import java.util.Scanner;

class ArmstrongNumbers{
	public static boolean isArmstrong(int num){
		int d = 0, temp = num, sum =0;
		int digits = String.valueOf(num).length();
		
		while(temp > 0){
			d = temp % 10;
			sum += Math.pow(d, digits);
			temp /= 10;
		}
		return sum == num;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("All Armstrong Numbers between (1-10000) are :\n");
		for(int i = 1;i<=10000;i++){
			if(isArmstrong(i))
				System.out.print(i+"  ");
		}
	}
}