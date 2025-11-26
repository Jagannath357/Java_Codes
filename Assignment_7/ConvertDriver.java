import java.util.Scanner;

class Convert {
	double feet = 0.0f, inches = 0.0f;
	double cm = 0.0f;

	Convert(double feet, double inches) {
		this.feet = feet;
		this.inches = inches;
	}

	void centimeter() throws NegativeNumberException, NonDigitException {
		if (feet < 0.0 || inches < 0.0) {
			throw new NegativeNumberException();
		}
		double total = inches + feet * 12.0;
		cm = total * 2.54;
	}
}
class NegativeNumberException extends Exception {
	String message = "NegativeNumberException : ";

	public String toString() {
		return message + "Length can not be Negative ";
	}
}
class NonDigitException extends Exception {
	String message = "NonDigitException : ";

	public String toString() {
		return message + "Length must be a number ";
	}
}
// 1 Inch = 2.54cm,  1 Foot = 12inch
class ConvertDriver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the Length : ");
		System.out.print("Feet : ");
		String feet = sc.nextLine();
		System.out.print("Inches : ");
		String inches = sc.nextLine();
		Double f = 0.0d, i = 0.0d;
		try {
			try {
				f = Double.parseDouble(feet);
				i = Double.parseDouble(inches);
			} catch (NumberFormatException e) {
				throw new NonDigitException();
			}
		}
		catch(NonDigitException e){
			System.out.println(e);
			return;
		}

		Convert c = new Convert(f, i);
		try {
			c.centimeter();
		} catch (NegativeNumberException e) {
			System.out.println("\nError" + e);
		}
		catch (NonDigitException e) {
			System.out.println(e);
		}
		System.out.println("Centemer : " + c.cm);

	}
}