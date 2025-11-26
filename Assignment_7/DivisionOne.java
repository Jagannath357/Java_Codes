import java.util.Scanner;

public class DivisionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myloop : while (true) {
            System.out.print("Enter n1 : ");
            float n1 = sc.nextFloat();
            System.out.print("Enter n2 : ");
            float n2 = sc.nextFloat();
            float res = 0.0f;
            try {
                res = n1/n2;
                if (n2 == 0) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("\nError : ArithmeticException. Message : n2 can not be zero!\nEnter again.\n");
                continue myloop;
            }
            System.out.println("Result : "+res);
            break;
        }
    }
}