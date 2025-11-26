import java.util.Scanner;
import btech.arithmetic.MyMath;

public class TestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n----- ARITHMETIC OPERATIONS -----");
        System.out.println("Addition       = " + math.add(a, b));
        System.out.println("Subtraction    = " + math.subtract(a, b));
        System.out.println("Multiplication = " + math.multiply(a, b));
        System.out.println("Division       = " + math.divide(a, b));
        System.out.println("Modulus        = " + math.mod(a, b));
        System.out.println("---------------------------------");
    }
}
