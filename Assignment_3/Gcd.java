class Gcd{
	public static void main(String g[]){
		if(g.length != 2){
			System.out.println("Error : You should give two numbers!");
		}
		else{
			int a = Integer.parseInt(g[0]);
			int b = Integer.parseInt(g[1]);
			int c = a;
			int d = b;
			while(d != 0){
				int temp = d;
				d = c % d;
				c = temp;
			}
			System.out.println("\nGcd of "+a+" and "+b+" is "+c+"\n");
		}
	}
}