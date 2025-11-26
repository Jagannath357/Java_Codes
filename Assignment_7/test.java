import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println(str);
        System.out.println(num);
    }
}
