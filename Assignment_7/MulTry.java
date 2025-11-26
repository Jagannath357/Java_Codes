class MulTry{
	public static void main(String args[]){
		int a, b;
		float div = 0.0f;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error : You must have to provide two arguments throw CLI");
		}
		catch(ArithmeticException e){
			System.out.println("Error : Second number must be > 0");
		}
		System.out.println("Divsion is : "+div);
	}
}
