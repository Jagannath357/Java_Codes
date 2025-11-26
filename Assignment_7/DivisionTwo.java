import java.util.Scanner;

public class DivisionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myloop: while (true) {
            System.out.print("Enter x : ");
            float x = sc.nextFloat();
            System.out.print("Enter y : ");
            float y = sc.nextFloat();
            float res = 0.0f;
            try {
                if ((x-y) == 0) {
                    throw new ArithmeticException();
                }
                res = x / (x-y);
                                
            } catch (ArithmeticException e) {
                System.out.println("\nError : ArithmeticException. Message : x should be eqal to y!\nEnter again.\n");
                continue myloop;
            }
            System.out.println("Result : " + res);
            break;
        }
    }
}